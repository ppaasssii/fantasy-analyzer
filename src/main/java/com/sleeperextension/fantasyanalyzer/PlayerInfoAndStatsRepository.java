package com.sleeperextension.fantasyanalyzer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.List;

@org.springframework.stereotype.Repository
public interface PlayerInfoAndStatsRepository extends MongoRepository<PlayerAndStatsInfoDataMapper, ObjectId> {
    Optional<PlayerAndStatsInfoDataMapper> findByPlayerId(String playerId);
     List<PlayerAndStatsInfoDataMapper> findByPlayer_LastName(String lastName); // Updated to return a list of players with the same last name
}