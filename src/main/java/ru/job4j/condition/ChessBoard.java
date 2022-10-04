package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
            && isValid(y1) && isValid(y2)) {
            if (x1 == y1 || x2 == y2) {
                rsl = Math.abs(x2 -x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        ChessBoard.way(6, 7, 1, 2);
        ChessBoard.way(7, 0, 0, 7);
        ChessBoard.way(2, 6, 4, 1);
        ChessBoard.way(-1, 6, 4, 1);
        ChessBoard.way(2, -1, 4, 1);
        ChessBoard.way(2, 6, -1, 1);
        ChessBoard.way(2, 6, 4, 1);
    }
}
