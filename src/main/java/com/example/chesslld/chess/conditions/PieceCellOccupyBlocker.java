package com.example.chesslld.chess.conditions;

import com.example.chesslld.chess.model.Cell;
import com.example.chesslld.chess.model.Piece;
import com.example.chesslld.chess.model.Player;

public interface PieceCellOccupyBlocker {
    boolean isCellNonOccupiablePiece(Cell cell, Piece piece, Player player);
}
