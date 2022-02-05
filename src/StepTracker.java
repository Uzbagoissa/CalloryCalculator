import java.util.ArrayList;

public class StepTracker {

    Converter converter = new Converter();
    int monthDays[][] = new int[12][30];

    void saveSteps(int month, int day, int stepsByDay) {
        System.out.println("Количество пройденных шагов сохранено: " + stepsByDay);
        monthDays[month - 1][day - 1] = stepsByDay;
    }

    void printAll(int month) {
        int i = month - 1;
        for (int j = 0; j < 30; j++) {
            System.out.print((j + 1) + " день: " + monthDays[i][j] + ", ");
        }
    }

    void printStepsSum(int month) {
        int i = month - 1;
        double stepsSum = 0;
        for (int j = 0; j < 30; j++) {
            stepsSum += monthDays[i][j];
        }
        System.out.println(" ");
        System.out.println("Общее количество шагов за месяц: " + stepsSum);
    }

    void printStepsMax(int month) {
        int i = month - 1;
        double stepsMax = 0;
        for (int j = 0; j < 30; j++) {
            if (monthDays[i][j] > stepsMax) {
                stepsMax = monthDays[i][j];
            }
        }
        System.out.println("Максимальное пройденное количество шагов в месяце: " + stepsMax);
    }

    void printStepsAverage(int month) {
        int i = month - 1;
        double stepsAvarage = 0;
        double stepsSum = 0;
        for (int j = 0; j < 30; j++) {
            stepsSum = monthDays[i][j] + stepsSum;
            stepsAvarage = stepsSum / 30;
        }
        System.out.println("Среднее количество шагов: " + stepsAvarage);
    }

    void printDistance(int month) {
        int i = month - 1;
        double distance = 0;
        double stepsSum = 0;
        for (int j = 0; j < 30; j++) {
            stepsSum += monthDays[i][j];
            distance = converter.getDistance(stepsSum);
        }
        System.out.println("Пройденная дистанция: " + distance + " км");
    }
    void printCcalBurn(int month) {
        int i = month - 1;
        double CCal = 0;
        double stepsSum = 0;
        for (int j = 0; j < 30; j++) {
            stepsSum += monthDays[i][j];
            CCal = converter.getCCal(stepsSum);
        }
        System.out.println("Количество сожжённых килокалорий: " + CCal);
    }

    void printBestSeries(double stepTarget, int month) {
        int i = month - 1;
        ArrayList<Integer>daySeries = new ArrayList<>();
        int bestDays = 0;
        int bestSeries = 0;
        for (int j = 0; j < 30; j++) {
            if (monthDays[i][j] >= stepTarget){
                bestDays = bestDays + 1;
            } else {
                daySeries.add(bestDays);
                bestDays = 0;
            }
        }
        for (Integer ferr : daySeries) {
            if (ferr > bestSeries) {
                bestSeries = ferr;
            }
        }
        System.out.println("Лучшая серия: " + bestSeries);
    }
}
