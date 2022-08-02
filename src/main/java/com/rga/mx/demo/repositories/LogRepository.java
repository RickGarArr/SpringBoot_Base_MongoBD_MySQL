package com.rga.mx.demo.repositories;

import com.rga.mx.demo.entities.LogDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<LogDocument, ObjectId> {
}
