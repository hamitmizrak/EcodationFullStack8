package com.hamitmizrak.data.entity;

import com.hamitmizrak.audit.AuditingBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

// LOMBOK
@Getter @Setter

// Super
@MappedSuperclass
abstract public class BaseEntity extends AuditingBase {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //unique id
    private Long id;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;

}
