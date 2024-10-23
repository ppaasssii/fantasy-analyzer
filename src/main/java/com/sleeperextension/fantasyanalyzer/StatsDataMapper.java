package com.sleeperextension.fantasyanalyzer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatsDataMapper {
    @JsonProperty("adp_2qb")
    private double adp_2qb;

    @JsonProperty("adp_dynasty")
    private double adp_dynasty;

    @JsonProperty("adp_dynasty_2qb")
    private double adp_dynasty_2qb;

    @JsonProperty("adp_dynasty_half_ppr")
    private double adp_dynasty_half_ppr;

    @JsonProperty("adp_dynasty_ppr")
    private double adp_dynasty_ppr;

    @JsonProperty("adp_dynasty_std")
    private double adp_dynasty_std;

    @JsonProperty("adp_half_ppr")
    private double adp_half_ppr;

    @JsonProperty("adp_idp")
    private double adp_idp;

    @JsonProperty("adp_ppr")
    private double adp_ppr;

    @JsonProperty("adp_rookie")
    private double adp_rookie;

    @JsonProperty("adp_std")
    private double adp_std;

    @JsonProperty("cmp_pct")
    private double cmp_pct;

    @JsonProperty("fum_lost")
    private double fum_lost;

    @JsonProperty("gp")
    private double gp;

    @JsonProperty("pass_2pt")
    private double pass_2pt;

    @JsonProperty("pass_att")
    private double pass_att;

    @JsonProperty("pass_cmp")
    private double pass_cmp;

    @JsonProperty("pass_fd")
    private double pass_fd;

    @JsonProperty("pass_int")
    private double pass_int;

    @JsonProperty("pass_td")
    private double pass_td;

    @JsonProperty("pass_yd")
    private double pass_yd;

    @JsonProperty("pts_half_ppr")
    private double pts_half_ppr;

    @JsonProperty("pts_ppr")
    private double pts_ppr;

    @JsonProperty("pts_std")
    private double pts_std;

    @JsonProperty("rush_att")
    private double rush_att;

    @JsonProperty("rush_fd")
    private double rush_fd;

    @JsonProperty("rush_td")
    private double rush_td;

    @JsonProperty("rush_yd")
    private double rush_yd;
}
