import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в консольную игру - Судоку");
        System.out.println("Есть 3 уровня сложности:");
        System.out.println("Легкая");
        System.out.println("Средняя");
        System.out.println("Сложная");
        System.out.println("Выберите уровень сложности цифрой от 1 до 3 (При неверном значении будет выбран уровень easy)");
        int n = scanner.nextInt();
        int[][] sudoku = presets.returnArrays(n);


        while(!SudokuChecker.isSudokuSolved(presets.returnArrays(n))){
            System.out.println("Игра напчалась!");
            System.out.println("Если вы хотите убедиться в правильности хода, не стоит волноваться, игра сама оповестит вас если вы ввели непавильную строку или число");
            System.out.println("У вас есть 2 действия:");
            System.out.println("Введите 1, чтобы вывести Судоку");
            System.out.println("Введите 2, если хотите ввести изменения в Судоку");
            while(true){
                int a = scanner.nextInt(); // переменная для считывания действии
                if(a == 1){
                    presets.printArrays(n);
                } else if (a == 2) {
                    System.out.println("Вам нужно ввести нужные данные для ввода а именно:");
                    System.out.print("номер строки:");
                    int x = scanner.nextInt();
                    System.out.print("номер символа в строке:");
                    int y = scanner.nextInt();
                    System.out.print("Число, на которую нужно поменять:");
                    int num = scanner.nextInt();

                    SudokuChecker.changeSudoku(sudoku, x, y, num);
                }else{
                    System.out.println("Такого действия нету(");
                }

            }
        }


    }
}