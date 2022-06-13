package com.example.chesslld.chess.model;

import lombok.Getter;

@Getter
public class Board {
    Cell[][] cell;
    int boardSize;

    public Board(Cell[][] cell, int size) {
        this.cell = cell;
        this.boardSize = size;
    }

    public Cell getRightCell(Cell cell) {

    }
    public Cell getLeftCell(Cell cell) {

    }
    public Cell getUpCell(Cell cell) {

    }
    public Cell getDownCell(Cell cell) {

    }

    public Cell getCellAtLocation(int x, int y){
        if(x < 0 || x >= boardSize) {
            return null;
        }

        if(y < 0 || y >= boardSize) {
            return null;
        }
        return cell[x][y];
    }

    pblic boolean isPlayerOnCheck(Player player) {
        return checkIfPieceCanbeKilled(player.getPiece(PieceType.KING), kingCheckEvaluationBlockers(), player);
    }
}
