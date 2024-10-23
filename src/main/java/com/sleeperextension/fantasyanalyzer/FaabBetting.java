package com.sleeperextension.fantasyanalyzer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user-faab-player-bets")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FaabBetting {

    @Id
    private String faabTransactionId;

    private String userId;

    private Double faabAmount;

    private String playerId;

    private String leagueId;

    public FaabBetting(String faabTransactionId, Double faabAmount, String userId, String playerId, String leagueId) {
        this.faabTransactionId = faabTransactionId;
        this.faabAmount = faabAmount;
        this.userId = userId;
        this.playerId = playerId;
        this.leagueId = leagueId;
    }
}

