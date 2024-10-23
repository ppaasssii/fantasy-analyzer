package com.sleeperextension.fantasyanalyzer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
public class PlayerProjectionsDataMapper {
    @Id
    private ObjectId projectionId;
    private Object stats;
    private String category; // projection
    private String season; // e.g. 2024
    private int week; // null = whole season, 1 = week 1...
    private String playerIid; // ID of the player
    private String gameId; // season = whole season, game_id = 123 = game X vs Y
    private String team;
    private String sourceCompany;
    private Object player;

}
