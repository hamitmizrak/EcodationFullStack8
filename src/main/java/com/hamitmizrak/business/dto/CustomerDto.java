package com.hamitmizrak.business.dto;

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

public class CustomerDto implements Serializable {
    private final static Long serialVersionUID=1L;

    private Long id;
    private String username;
    private String email;
    private String password;
    private Date systemDate;
}
