package com.sleeperextension.fantasyanalyzer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "playerStats")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerAndStatsInfoDataMapper {

    @Id
    @JsonSerialize(using = ObjectIdSerializer.class) // Serializer hinzufügen
    @JsonDeserialize(using = ObjectIdDeserializer.class)  // Deserializer hinzufügen
    private ObjectId statRecordId;

    @JsonProperty("category")
    private String category; // "category" -> stat category (e.g., "stat")

    @JsonProperty("year")
    private String season; // "season" -> year (e.g., 2024)

    @JsonProperty("seasonType")
    private String season_type; // "season_type" -> season type (e.g., "regular")
    //noch zum unique Identifier machen
    @JsonProperty("playerId")
    private String playerId; // "player_id" -> playerId identifier

    @JsonProperty("gameId")
    private String game_id; // "game_id" -> game or season identifier

    @JsonProperty("playersTeamName")
    private String team; // "team" -> player’s team

    @JsonProperty("dataSourceCompany")
    private String company; // "company" -> data provider (e.g., "sportradar")

    private StatsDataMapper stats; // Maps the nested "stats" object

    private PlayerInfoDataMapper player; // Contains information about the player
}