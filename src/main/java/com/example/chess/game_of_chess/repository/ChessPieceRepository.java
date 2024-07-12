package com.example.chess.game_of_chess.repository;

import com.example.chess.game_of_chess.model.ChessPiece;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChessPieceRepository extends JpaRepository<ChessPiece, Long> {


}
