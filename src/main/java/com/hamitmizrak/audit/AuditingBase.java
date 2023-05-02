package com.hamitmizrak.audit;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

public class AuditingBase {
    // Auditing: Database hangi kullanıcı ne zaman
    // ne ekledi veya ne güncelledi

    @CreatedBy
    @Column(name="created_user")
    private String createdUser;

    @CreatedDate
    @Column(name="created_date")
    private Date createdDate;

    @LastModifiedBy
    @Column(name="updated_user")
    private String updatedUser;

    @LastModifiedDate
    @Column(name="updated_date")
    private Date updatedDate;
}
