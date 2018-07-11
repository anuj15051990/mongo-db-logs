package com.fitchrating.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fitchrating.app.document.LogRead;

@Repository
public interface LoggerReadRepository extends MongoRepository<LogRead, String> {

}
