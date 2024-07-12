package com.example.chess.game_of_chess.controller;

import com.example.chess.game_of_chess.model.Game;
import com.example.chess.game_of_chess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @PostMapping
    public Game createGame(){
        return gameService.createGame();
    }

    @GetMapping("/{id}")
    public Optional<Game> getGame(@PathVariable Long id){
        return gameService.getGame(id);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game){
        game.setId(id);
        return gameService.updateGame(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id){
        gameService.deleteGame(id);
    }
}
