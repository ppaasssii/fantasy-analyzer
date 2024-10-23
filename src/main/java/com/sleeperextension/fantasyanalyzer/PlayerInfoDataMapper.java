package com.sleeperextension.fantasyanalyzer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfoDataMapper {

    @JsonProperty("playerFirstName")
    private String first_name;

    @JsonProperty("playerLastName")
    private String lastName;

    @JsonProperty("playerPosition")
    private String position;

    @JsonProperty("playersFantasyPositions")
    private List<String> fantasy_positions;

    @JsonProperty("injuryBodyPart")
    private String injury_body_part;

    @JsonProperty("injuryStartDate")
    private String injury_start_date;

    @JsonProperty("injuryStatus")
    private String injury_status;

    @JsonProperty("playersTeamName")
    private String team;

    @JsonProperty("playersTeamAbbr")
    private String team_abbr;

    @JsonProperty("playerTeamChangedAt")
    private String team_changed_at;

    @JsonProperty("yearsExp")
    private String years_exp;

    private Map<String, String> metadata; // Weitere Details (z.B. rookie year)
}