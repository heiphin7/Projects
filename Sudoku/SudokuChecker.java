public class SudokuChecker {
    public static void main(String[] args) {

    }
    public static boolean isSudokuSolved(int[][] array){
        int counter = 0;
        while(counter != 0){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] == 0){
                        counter++;
                    }
                }
            }
        }
        if(counter == 0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isCorrectMove(int[][] sudoku , int x, int y, int n)
    {
        for (int i = 0; i < 9; i++) {
            if(sudoku[i][y - 1] == n){
                System.out.println("Некорректный ход: в той же вертикальной строке есть такое же число");
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(sudoku[x][i] == n){
                System.out.println("Некорректный ход: в той же строке есть такое же число");
                return false;
            }
        }

        int startRowBlock = (x / 3) * 3;
        int startColBlock = (y / 3) * 3;

        for (int row = startRowBlock; row < startRowBlock + 3; row++) {
            for (int col = startColBlock; col < startColBlock + 3; col++) {
                if (sudoku[row][col - 1] == n) {
                    System.out.println("Некорректный ход: в том же \"квадрате\" есть такое же число");
                    return false;
                }
            }
        }
        return true;
    }

    public static void changeSudoku(int[][] array, int row, int col, int num) {
        if(num < 0 || num > 10 || row < 0 || col < 0){
            System.out.println("Некорректный ход");
        }else{
            if(isCorrectMove(array, row, col, num)){
                array[row - 1][col - 1] = num;
                System.out.println("Судоку был успешно изменен!");
            }else{

            }
        }
    }
}