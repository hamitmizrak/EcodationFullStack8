package com.hamitmizrak.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import java.util.Date;
import java.util.Map;

/*
"timestamp": "2023-05-04T16:10:08.197+00:00",
"status": 404,
"error": "Not Found",
"message": "HV000028: Unexpected exception during isValid call.",
"path": "/customer/api/v1/create"
*/

// LOMBOK
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Log4j2
public class ApiResult {
    private int status;
    private String error;
    private String message;
    private String path;
    private Date timestamp=new Date(System.currentTimeMillis());

    // ValidationError
    private Map<String,String> validationErrors;

    // constructor
    public ApiResult(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    // constructor
    public ApiResult(int status,  String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
    }
}
