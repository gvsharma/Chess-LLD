package com.example.chesslld.chess.conditions;

public class PieceCellOccupyBlockerFactory {
    public static PieceCellOccupyBlocker defaultBaseBlocker() {
        return new PieceCellOccupyBlockerSelfPiece();
    }

    
}
