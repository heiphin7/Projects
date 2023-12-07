
public class presets{
    public static int[][] easy = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
    public static int[][] medium = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 1, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0}
    };
    public static int[][] hard = {
            {0, 0, 0, 8, 0, 0, 0, 0, 0},
            {0, 5, 9, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 6, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 7, 0},
            {0, 0, 0, 0, 4, 0, 3, 2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 5},
            {8, 0, 0, 0, 0, 0, 7, 0, 0},
            {0, 0, 0, 0, 2, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 0, 0, 1, 0}
    };
    public static void main(String[] args) {
    }
    public static void printArrays(int a) {
        // В соответствии с выбором игрока, возвращаем ему массивы. Вывод идет через цикл
        if (a == 1) {
            for (int i = 0; i < easy.length; i++) {
                for (int j = 0; j < easy[i].length; j++) {
                    System.out.print(easy[i][j] + " ");
                    // После 3 - ей и 6 - ой строки будет "|", это нужно чтобы придать судоку более красивый вид
                    if (j == 2 || j == 5) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                // А после 3 - ей и 6 - ой строки будет выведена цела строка, состоящая из "_", это также нужно, чтобы придать оприятный вид
                if(i == 2 || i == 5){
                    for (int k = 0; k < easy[k].length - 2; k++) {
                        System.out.print("___");
                    }
                    System.out.println();
                }
            }
        }


        else if (a == 2) {
            for (int i = 0; i < medium.length; i++) {
                for (int j = 0; j < medium[i].length; j++) {
                    System.out.print(medium[i][j] + " ");
                    // После 3 - ей и 6 - ой строки будет "|", это нужно чтобы придать судоку более красивый вид
                    if (j == 2 || j == 5) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                // А после 3 - ей и 6 - ой строки будет выведена цела строка, состоящая из "_", это также нужно, чтобы придать оприятный вид
                if(i == 2 || i == 5){
                    for (int k = 0; k < medium[k].length - 2; k++) {
                        System.out.print("___");
                    }
                    System.out.println();
                }
            }
        }


        else if (a == 3) {
            for (int i = 0; i < hard.length; i++) {
                for (int j = 0; j < hard[i].length; j++) {
                    System.out.print(hard[i][j] + " ");
                    // После 3 - ей и 6 - ой строки будет "|", это нужно чтобы придать судоку более красивый вид
                    if (j == 2 || j == 5) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                // А после 3 - ей и 6 - ой строки будет выведена цела строка, состоящая из "_", это также нужно, чтобы придать оприятный вид
                if(i == 2 || i == 5){
                    for (int k = 0; k < hard[k].length - 2; k++) {
                        System.out.print("___");
                    }
                    System.out.println();
                }
            }
        }


        else{
            // Если игрок ввел некорректное число, возвращаем ему массив easy по умолчанию
            System.out.println("Вы ввели некорректное число");
            for (int i = 0; i < easy.length; i++) {
                for (int j = 0; j < easy[i].length; j++) {
                    System.out.print(easy[i][j] + " ");
                    // После 3 - ей и 6 - ой строки будет "|", это нужно чтобы придать судоку более красивый вид
                    if (j == 2 || j == 5) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                // А после 3 - ей и 6 - ой строки будет выведена цела строка, состоящая из "_", это также нужно, чтобы придать оприятный вид
                if(i == 2 || i == 5){
                    for (int k = 0; k < easy[k].length - 2; k++) {
                        System.out.print("___");
                    }
                    System.out.println();
                }
            }
        }
        
    }
    public static int[][] returnArrays(int level){
        if(level == 1){
            return easy;
        } else if (level == 2) {
            return medium;
        } else if (level == 3) {
            return hard;
        }else{
            return easy;
        }
    }
}