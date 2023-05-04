package com.hamitmizrak.error;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LOMBOK
@Log4j2
@RequiredArgsConstructor //injection

@RestController
@CrossOrigin
public class CustomErrorHandleWebRequest implements ErrorController {

    // Injection
    private final ErrorAttributes errorAttributes;

    // http://localhost:2222/error
    @RequestMapping("/error")
    public ApiResult handleErrorMethod(WebRequest webRequest) {

        // ApiResult
        int status;
        String message;
        String path;
        ApiResult error;

        // Spring >=2.3
        // Spring'ten gelen attributesleri yakalamak
        Map<String, Object> attributes = this.errorAttributes.getErrorAttributes
                (webRequest,
                 ErrorAttributeOptions.of(ErrorAttributeOptions.Include.MESSAGE, ErrorAttributeOptions.Include.BINDING_ERRORS)); // end attributes
        status= (int) attributes.get("status");
        message= (String) attributes.get("message");
        path= (String) attributes.get("path");
        error=new ApiResult(status,message,path);

        //attributes error varsa
        if(attributes.containsKey("errors")){
            List<FieldError> fieldErrorList= (List<FieldError>) attributes.get("error");
            Map<String,String> validationMistake=new HashMap<>();
            for (FieldError fieldError:fieldErrorList) {
                validationMistake.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            error.setValidationErrors(validationMistake);
        }
        return error;
    } //end method handleErrorMethod
} // end class CustomErrorHandleWebRequest
