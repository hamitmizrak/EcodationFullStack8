package com.hamitmizrak.business.dto;

import com.hamitmizrak.annotation.UniqueEmail;
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

    // ID
    private Long id;

    // NAME
    @NotEmpty(message = "{customer.name.validation.constraints.NotNull.message}")
    private String name;

    // SURNAME
    @NotEmpty(message = "{customer.surname.validation.constraints.NotNull.message}")
    private String surname;

    // EMAIL
    @NotEmpty(message = "{customer.email.validation.constraints.NotNull.message}")
    @Email
    // Kendi ==> Annotation
    @UniqueEmail
    private String email;

    // PASSWORD
    @NotEmpty(message = "{customer.password.validation.constraints.NotNull.message}")
    @Size(min = 7,max = 20,message ="{customer.password.pattern.validation.constraints.NotNull.message}" )
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).*$",message = "{customer.password.pattern.validation.constraints.NotNull.message}")
    private String password;

    public CustomerDto(Long id, String name, String surname, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public CustomerDto(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    private String image;
    private Object specialObject;

    private Date systemDate;
}
