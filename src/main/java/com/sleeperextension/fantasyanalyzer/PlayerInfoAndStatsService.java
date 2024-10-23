package com.sleeperextension.fantasyanalyzer;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class PlayerInfoAndStatsService {

    @Autowired
    private PlayerInfoAndStatsRepository playerInfoAndStatsRepository;

    public List<PlayerAndStatsInfoDataMapper> allPlayerStats(){
     return playerInfoAndStatsRepository.findAll();
    }

    public PlayerAndStatsInfoDataMapper singleStatRecord(ObjectId statRecordId){
        return playerInfoAndStatsRepository.findById(statRecordId).orElse(null);
    }
    public PlayerAndStatsInfoDataMapper singleStatRecordByPlayerId(String playerId) {
        return playerInfoAndStatsRepository.findByPlayerId(playerId).orElse(null);
    }
    public List<PlayerAndStatsInfoDataMapper> singleStatRecordByLastName(String lastName) {
        return playerInfoAndStatsRepository.findByPlayer_LastName(lastName);

}
}
