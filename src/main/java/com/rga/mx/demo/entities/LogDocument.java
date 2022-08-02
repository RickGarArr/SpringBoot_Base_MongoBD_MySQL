package com.rga.mx.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "log")
@Data
public class LogDocument {
    @Id
    private String id;

    @Field(name = "created_at")
    private Date createdAt;

    private String action;

    public LogDocument() {
    }

    public LogDocument(Date createdAt, String action) {
        this.createdAt = createdAt;
        this.action = action;
    }

    public LogDocument(String id, Date createdAt, String action) {
        this.id = id;
        this.createdAt = createdAt;
        this.action = action;
    }
}
