public class SudokuChecker {
    public static void main(String[] args) {

    }
    // Эта простая проверка на решенность, которая проверяет нету ли нулей в массиве.
    // Он работает правильно, ведь с помощью метода isCorrectMove мы проверяем правильность каждого хода
    // И если двумерный массив заполнен и у него правильные ходы = Он выполнен
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
    // А это проверка на правильность хода
    public static boolean isCorrectMove(int[][] sudoku , int x, int y, int n)
    {
        // Этот цикл ищет совпадения в по вертикали( То есть, нету ли таких же чисел по вертикали)
        for (int i = 0; i < 9; i++) {
            if(sudoku[i][y - 1] == n){
                System.out.println("Некорректный ход: в той же вертикальной строке есть такое же число");
                return false;
            }
        }
        // Этот цикл аналогичен с предыдущим и проверяет, нету ли таких же числел в той же строке 
        for (int i = 0; i < 9; i++) {
            if(sudoku[x][i] == n){
                System.out.println("Некорректный ход: в той же строке есть такое же число");
                return false;
            }
        }


        // А это проверка уже посложнее

        // Тут мы высчитываем координаты "квадрата" в котором он находится
        int startRowBlock = (x / 3) * 3;
        int startColBlock = (y / 3) * 3;
        // А этот цикл уже проверяет, нету ли таких же чисел в его квадрате
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

    // Это метод, который позволяет на вносить изменения в массив sudoku
    public static void changeSudoku(int[][] array, int row, int col, int num) {
        if(num < 0 || num > 10 || row < 0 || col < 0){
            System.out.println("Некорректный ход");
        }else{
            // В этом методе используется другой метод, который проверяет правильность хода
            // Это обеспечивает правильность ходов и заполнение метода
            if(isCorrectMove(array, row, col, num)){
                array[row - 1][col - 1] = num;
                System.out.println("Судоку был успешно изменен!");
            }else{

            }
        }
    }
}
