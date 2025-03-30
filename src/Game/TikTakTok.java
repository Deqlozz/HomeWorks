package Game;
import java.util.Scanner;
import java.util.Random;
    public class TikTakTok {
        public static char[][] board = new char[3][3];
        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) {
            System.out.println("Добро пожаловать в Крестики-Нолики!");
            initializeBoard();
            printBoard();

            boolean playerTurn = random.nextBoolean();
            if (playerTurn) {
                System.out.println("Вы ходите первым (X)!");
            } else {
                System.out.println("Компьютер ходит первым (O)!");
            }


            while (true) {
                if (playerTurn) {
                    playerMove();
                } else {
                    computerMove();
                }

                printBoard();


                if (checkWin(playerTurn ? 'X' : 'O')) {
                    System.out.println(playerTurn ? "Вы победили!" : "Компьютер победил!");
                    break;
                }


                if (isBoardFull()) {
                    System.out.println("Ничья!");
                    break;
                }

                playerTurn = !playerTurn; // Передача хода
            }
        }

        public static void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }

        public static void printBoard() {
            System.out.println("  1 2 3");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }


        public static void playerMove() {
            while (true) {
                System.out.print("Ваш ход (строка столбец, например 1 2): ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                    board[row][col] = 'X';
                    break;
                } else {
                    System.out.println("Некорректный ход! Попробуйте еще раз.");
                }
            }
        }


        public static void computerMove() {
            System.out.println("Ход компьютера:");
            while (true) {
                int row = random.nextInt(3);
                int col = random.nextInt(3);

                if (board[row][col] == '-') {
                    board[row][col] = 'O';
                    break;
                }
            }
        }

        // Проверка победы
        public static boolean checkWin(char symbol) {

            for (int i = 0; i < 3; i++) {
                if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                    return true;
                }
            }


            for (int j = 0; j < 3; j++) {
                if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == symbol) {
                    return true;
                }
            }

            if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
                return true;
            }
            if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
                return true;
            }

            return false;
        }

        public static boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
    }
