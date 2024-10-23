package com.sleeperextension.fantasyanalyzer;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/allPlayerInfoAndStats")
public class PlayerInfoAndStatsController {


    @Autowired
    private PlayerInfoAndStatsService playerInfoAndStatsService;

    @GetMapping
    public ResponseEntity<List<PlayerAndStatsInfoDataMapper>> getAllPlayerStats() {
        try {
            List<PlayerAndStatsInfoDataMapper> statsList = playerInfoAndStatsService.allPlayerStats();

            if (statsList.isEmpty()) {
                // Wenn keine Daten gefunden wurden, 404 Not Found zurückgeben
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            // Erfolgreiche Antwort mit HTTP-Status 200 OK
            return ResponseEntity.ok(statsList);

        } catch (Exception e) {
            // Wenn ein unerwarteter Fehler auftritt, 500 Internal Server Error zurückgeben
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
    @GetMapping("/statRecordId/{statRecordId}")
    public HttpEntity<PlayerAndStatsInfoDataMapper> getSingleStatRecord(@PathVariable ObjectId statRecordId) {
        try {
            PlayerAndStatsInfoDataMapper singleStatRecord = playerInfoAndStatsService.singleStatRecord(statRecordId);

            if (singleStatRecord == null) {
                // Wenn keine Daten gefunden wurden, 404 Not Found zurückgeben
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            // Erfolgreiche Antwort mit HTTP-Status 200 OK
            return ResponseEntity.ok(singleStatRecord);

        } catch (Exception e) {
            // Wenn ein unerwarteter Fehler auftritt, 500 Internal Server Error zurückgeben
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }

    }

    @GetMapping("/playerId/{playerId}")
    public HttpEntity<PlayerAndStatsInfoDataMapper> getSingleStatRecordByPlayerId(@PathVariable String playerId) {
        try {
            PlayerAndStatsInfoDataMapper singleStatRecordByPlayerId = playerInfoAndStatsService.singleStatRecordByPlayerId(playerId);

            if (singleStatRecordByPlayerId == null) {
                // Wenn keine Daten gefunden wurden, 404 Not Found zurückgeben
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            // Erfolgreiche Antwort mit HTTP-Status 200 OK
            return ResponseEntity.ok(singleStatRecordByPlayerId);

        } catch (Exception e) {
            // Wenn ein unerwarteter Fehler auftritt, 500 Internal Server Error zurückgeben
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
    @GetMapping("/playerLastName/{lastName}")
    public HttpEntity<String>getSingleStatRecordByLastName(@PathVariable String lastName){
        try {
            List<PlayerAndStatsInfoDataMapper> singleStatRecordByLastName = playerInfoAndStatsService.singleStatRecordByLastName(lastName);

            if (singleStatRecordByLastName == null || singleStatRecordByLastName.isEmpty()) {
                // Wenn keine Daten gefunden wurden, 404 Not Found zurückgeben
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No player found with the last name: " + lastName);
            }

            // Erfolgreiche Antwort mit HTTP-Status 200 OK
            return ResponseEntity.ok(singleStatRecordByLastName.toString());

        } catch (Exception e) {
            // Wenn ein unerwarteter Fehler auftritt, 500 Internal Server Error zurückgeben
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

}


