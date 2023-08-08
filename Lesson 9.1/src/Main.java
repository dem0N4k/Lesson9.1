import java.util.Scanner;

public class Main {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {

        while (true) {

            int command = inputCommand();
            if (command == 1) {
                y += inputSquareAmount();
            } else if (command == 2) {
                y -= inputSquareAmount();
            } else if (command == 3) {
                x += inputSquareAmount();
            } else if (command == 4) {
                x -= inputSquareAmount();
            } else if (command == 5) {
                printCoor();
            } else if (command == 6) {
                endGame();
                break;
            }
        }
    }

    private static void endGame() {
        System.out.println("Игра окончена!");
    }

    private static void printCoor() {
        System.out.println("Координаты робота: \n" + "По горизонтали: " + y
                + "\nПо вертикали: " + x);
    }

    private static int inputSquareAmount() {
        System.out.println("На сколько клеток сместиться?");
        return new Scanner(System.in).nextInt();
    }

    private static int inputCommand() {
        System.out.println("Введите куда вы хотите пойти: \n" + "1 - Вверх\n" + "2 - Вниз\n"
                + "3 - Вправо\n" + "4 - Влево\n" + "5 - Узнать координаты робота\n"
                + "6 - Выход из программы\n");
        return new Scanner(System.in).nextInt();
    }
}
