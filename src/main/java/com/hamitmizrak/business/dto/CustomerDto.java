package com.hamitmizrak.business.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
// validation
public class CustomerDto implements Serializable {
    private final static Long serialVersionUID=1L;

    private Long id;

    @NotEmpty(message = "{customer.name.validation.constraints.NotNull.message}")
    private String username;

    @NotEmpty(message = "{customer.email.validation.constraints.NotNull.message}")
    @Email
    private String email;

    @NotEmpty(message = "{customer.password.validation.constraints.NotNull.message}")
    @Size(min = 7,max = 20,message ="{customer.password.pattern.validation.constraints.NotNull.message}" )
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).*$",message = "{customer.password.pattern.validation.constraints.NotNull.message}")
    private String password;

    private Date systemDate;
}
