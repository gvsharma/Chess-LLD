package com.example.chesslld.chess.conditions;

import com.example.chesslld.chess.model.Piece;

public class NoMoveBaseCondition implements MoveBaseCondition{
    @Override
    public boolean isBaseConditionFullfilled(Piece piece) {
        return true;
    }
}
