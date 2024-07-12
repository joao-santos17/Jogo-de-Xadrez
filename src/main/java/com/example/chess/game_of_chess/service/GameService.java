package com.example.chess.game_of_chess.service;

import com.example.chess.game_of_chess.model.Game;
import com.example.chess.game_of_chess.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

    @Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public Game createGame(){
        Game game = new Game();
        game.setCurrentPlayer("WHITE");
        game.setStatus("OnGoing");
        // Initialize chess pieces and add to game
        // ..
        return gameRepository.save(game);
    }

    public Optional<Game> getGame(Long id) {
        return gameRepository.findById(id);
    }

    public Game updateGame(Game game) {
        return gameRepository.save(game);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    // Other game logic methods
}
