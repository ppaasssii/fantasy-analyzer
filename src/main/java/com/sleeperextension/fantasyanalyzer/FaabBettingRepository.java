package com.sleeperextension.fantasyanalyzer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaabBettingRepository extends MongoRepository<FaabBetting, ObjectId> {
    List<FaabBetting> findAll();
    List<FaabBetting> findByUserId(String userId);
}
