package com.example.chesslld.gameplay;

import com.example.chesslld.chess.model.Cell;
import com.example.chesslld.chess.model.Piece;
import lombok.Getter;

@Getter
public class PlayerMove {
    Piece piece;
    Cell toCell;
}
