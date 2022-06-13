package com.example.chesslld.chess.conditions;

import com.example.chesslld.chess.model.Piece;

public class MoveBaseConditionFirstMove implements MoveBaseCondition {
    @Override
    public boolean isBaseConditionFullfilled(Piece piece) {
        return piece.getNumMoves() == 0;
    }
}
