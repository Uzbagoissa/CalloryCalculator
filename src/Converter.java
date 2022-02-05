public class Converter {

    double getDistance(double steps){
        double distance = (steps * 75)/100000;
        return distance;
    }

    double getCCal(double steps){
        double CCal = (steps * 50)/1000;
        return CCal;
    }
}
