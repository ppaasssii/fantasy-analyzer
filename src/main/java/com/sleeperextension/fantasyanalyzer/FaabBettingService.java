package com.sleeperextension.fantasyanalyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FaabBettingService {


    @Autowired
    private FaabBettingRepository faabBettingRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public FaabBetting createFaabBet(String faabTransactionId, Double faabAmount, String userId, String playerId, String leagueId) {
        FaabBetting faabBetting = faabBettingRepository.insert(new FaabBetting(faabTransactionId, faabAmount, userId, playerId, leagueId));


        mongoTemplate.update(FaabBetting.class)
                .matching(Criteria.where("faabTransactionId").is(faabTransactionId))
                .apply(new Update().push("playerIds", faabBetting))
                .first();
        return faabBetting;
    }

    public List<FaabBetting> getFaabBets(String userId) {
        return faabBettingRepository.findByUserId(userId);
    }

    public List<FaabBetting> getAllFaabBets() {
        return faabBettingRepository.findAll();
    }
}
