package com.example.chess.game_of_chess.repository;

import com.example.chess.game_of_chess.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {

    
}
