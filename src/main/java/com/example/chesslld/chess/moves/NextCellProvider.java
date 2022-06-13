package com.example.chesslld.chess.moves;

import com.example.chesslld.chess.model.Cell;

public interface NextCellProvider {
    Cell nextCell(Cell cell);
}
