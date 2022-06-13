package com.example.chesslld.chess.model;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Player {
    List<Piece> pieces;

    public Player(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public Piece getPiece(PieceType pieceType) {
        for(Piece piece : pieces) {
            if(piece.getPiece() == pieceType){
                return piece;
            }
        }
    }
}
