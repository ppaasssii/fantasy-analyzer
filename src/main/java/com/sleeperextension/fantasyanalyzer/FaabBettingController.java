package com.sleeperextension.fantasyanalyzer;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/faabBetting")

public class FaabBettingController {

    @Autowired
    private FaabBettingService faabBettingService;


@PostMapping
public ResponseEntity<List<Map<String, Object>>> createFaabBets( @RequestBody List<Map<String, Object>> payload) {
    try {
        List<FaabBetting> faabBets = new ArrayList<>();
        for (Map<String, Object> betData : payload) {
            String faabTransactionId = (String) betData.get("faabTransactionId");
            Double faabAmount = (Double) betData.get("faabAmount");
            String playerId = (String) betData.get("playerId");
            String leagueId = (String) betData.get("leagueId");
            String userId = (String) betData.get("userId");
            FaabBetting faabBetting = faabBettingService.createFaabBet(faabTransactionId, faabAmount, userId, playerId, leagueId);
            faabBets.add(faabBetting);
        }
        return ResponseEntity.status(201).body(payload);
    } catch (Exception e) {
        //if an error occurs, return a 500 status code
        return ResponseEntity.status(500).body(null);
    }
}

    @GetMapping

    public ResponseEntity<List<FaabBetting>> getAllFaabBets() {
        try {
            List<FaabBetting> faabBets = faabBettingService.getAllFaabBets();
            return ResponseEntity.ok(faabBets);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("userId/{userId}")

    public ResponseEntity<List<FaabBetting>> getFaabBets(@PathVariable String userId) {
        List<FaabBetting> faabBets = faabBettingService.getFaabBets(userId);
        return ResponseEntity.ok(faabBets);
    }


}
