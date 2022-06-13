package com.example.chesslld.chess.conditions;

import com.example.chesslld.chess.model.Piece;

public interface MoveBaseCondition {
    boolean isBaseConditionFullfilled(Piece piece);
}
