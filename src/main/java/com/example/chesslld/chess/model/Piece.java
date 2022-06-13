package com.example.chesslld.chess.model;

import com.example.chesslld.chess.exceptions.InvalidMoveException;
import com.example.chesslld.chess.moves.PieceCellOccupyBlocker;
import com.example.chesslld.chess.moves.PossibleMovesprovider;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Piece {
    private boolean isKilled = false;
    private final Color color;
    private final List<PossibleMovesProvider> movesProvider;
    private Integer numMoves = 0;
    PieceType pieceType;

    @Setter
    @NonNull
    private Cell currentCell;

    public Piece(@NonNull final Color color, @NonNull final List<PossibleMovesProvider>list, @NonNull final PieceType pieceType) {
        this.color = color;
        this.movesProvider = list;
        this.pieceType = pieceType;
    }

    public boid killIt() {
        this.isKilled = true;
    }

    public void move(Player player, Cell toCell, Board board, List<PieceCellOccupyBlocker> additionalBlockers) {
        if(isKilled) {
            throw new InvalidMoveException();
        }
        List<Cell> nextPossibleCells = nextPossibleCells(board, additionalBlockers, player);
        if(!nextPossibleCells.contains(toCell)) {
            throw new InvalidMoveException();
        }

        killPieceInCell(toCell);
        this.currentCell.setCurrentPiece(null);
        this.currentCell = toCell;
        this.currentCell.setCurrentPiece(this);
        this.numMoves++;
    }

    public void killPieceInCell(Cell targetCell) {
        if(targetCell.getCurrentPiece() != null) {
            targetCell.getCurrentPiece().killIt();
        }
    }

    public List<Cell> nextPossibleCells(Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> cells = new ArrayList<>();
        for(PossibleMovesprovider movesprovider : this.movesProvider) {
            List<Cell> cells = movesprovider.getPossibleMoves(this, board, additionalBlockers, player);
            if(cells != null) {
                cells.addAll(cells);
            }
        }
        return cells;
    }
}
