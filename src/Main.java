import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();
        double stepTarget = 10000;

        System.out.println("Вас приветствует СЧЕТЧИК КАЛОРИЙ!");
        System.out.println(" ");

        while (true) {

            System.out.println(" ");
            System.out.println("Ваша цель - " + stepTarget + " шагов в день");
            printMenu();
            int command = scanner.nextInt();

            if (command == 1){
                System.out.println("Введите месяц числом");
                int month;
                while (true){
                    month = scanner.nextInt();
                    if (month < 1 || month > 12){
                        System.out.println("Введите существующий номер месяца");
                    } else {
                        break;
                    }
                }
                System.out.println(month);
                System.out.println("Введите день");
                int day;
                while (true){
                    day = scanner.nextInt();
                    if (day < 1 || day > 31){
                        System.out.println("Введите существующий номер дня");
                    } else {
                        break;
                    }
                }
                System.out.println(day);
                System.out.println("Напишите, какое количество шагов вы прошли за этот день?");
                int stepsByDay;
                while (true){
                    stepsByDay = scanner.nextInt();
                    if (stepsByDay < 0){
                        System.out.println("Введите число больше 0");
                    } else {
                        break;
                    }
                }
                stepTracker.saveSteps(month, day, stepsByDay);

            } else if (command == 2){
                System.out.println("Введите месяц числом");
                int month = scanner.nextInt();
                System.out.println(month);
                stepTracker.printAll(month);
                stepTracker.printStepsSum(month);
                stepTracker.printStepsMax(month);
                stepTracker.printStepsAverage(month);
                stepTracker.printDistance(month);
                stepTracker.printCcalBurn(month);
                stepTracker.printBestSeries(stepTarget, month);

            } else if (command == 3){
                System.out.println("Напишите вашу новую цель по количеству шагов в день");
                while (true){
                    stepTarget = scanner.nextDouble();
                    if (stepTarget < 0){
                        System.out.println("Введите число больше 0");
                    } else {
                        break;
                    }
                }

            } else if (command == 4){
                System.out.println("Выход");
                break;

            } else {
                System.out.println("Такой команды пока не существует");
            }
        }
    }

    public static void printMenu() {
        System.out.println(" ");
        System.out.println("Выберите пункт меню");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Напечатать статистику за определенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов за день");
        System.out.println("4 - Выйти из приложения");
    }
}

