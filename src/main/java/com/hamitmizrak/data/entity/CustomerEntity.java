package com.hamitmizrak.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

// ENTITY
@Entity
@Table(name = "customer")
public class CustomerEntity implements Serializable {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //unique id
    private Long id;

    // NAME
    private String name;

    // SURNAME
    private String surname;

    // EMAIL
    @Column(
            name = "email",
            insertable = true,
            updatable = true,
            nullable = true,
            length = 255,
            columnDefinition ="varchar(255) default 'email@gmail.com'" )
    private String email;

    // PASSWORD
    private String password;

    // IMAGE
    @Lob
    private String image;

    @Transient // Database bunu ekleme
    private Object specialObject;

    // DATE
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
}