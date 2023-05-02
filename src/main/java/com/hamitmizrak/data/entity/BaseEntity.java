package com.hamitmizrak.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hamitmizrak.audit.AuditingBaseClass;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

// LOMBOK
@Getter @Setter

// Json'a emir veriyoruz bunları takip etme
@JsonIgnoreProperties(value = {"created_date,updated_date"})

// Auditing
@EntityListeners(AuditingEntityListener.class)

// Super
@MappedSuperclass
abstract public class BaseEntity extends AuditingBaseClass {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //unique id
    private Long id;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;

}
