package ladderGame.view;

import ladderGame.DrawnLadder;

public class OutputView {
    private static final String EMPTY = "     ";
    private static final String FILLED = "-----";
    private static final String VERTICAL_BAR = "|";

    public static void printLadder(DrawnLadder drawnladder) {
        int rows = drawnladder.getRows();
        int columns = drawnladder.getColumns();

        for (int row = 0; row < rows; row++) {
            System.out.print(EMPTY);
            for (int column = 0; column < columns; column++) {
                System.out.print(VERTICAL_BAR);
                System.out.print(drawnladder.isDrawn(row, column) ? FILLED : EMPTY);
            }
            System.out.println(VERTICAL_BAR);
        }

    }

    public static void printNames(String[] names) {
        for (String name : names) {
            System.out.printf("%6s", name);
        }
        System.out.println();
    }
}
