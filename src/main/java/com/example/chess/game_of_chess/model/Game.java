package com.example.chess.game_of_chess.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


    @Entity
    @Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ChessPiece> pieces;
    private String currentPlayer;
    private String status;
}
