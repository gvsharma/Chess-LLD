package com.example.chesslld.chess.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cell {
    private int x;
    private  int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Setter
    private Piece currentPiece;

    public boolean isPiece() {
        return currentPiece != null;
    }
}
