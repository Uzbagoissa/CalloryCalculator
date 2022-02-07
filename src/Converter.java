public class Converter {

    double getDistance(double steps){
        double stepLengthSm = 75;
        double smetersToKmeters = 100000;
        return (steps * stepLengthSm)/smetersToKmeters;
    }

    double getCCal(double steps){
        double stepCal = 50;
        double calCcal = 1000;
        return (steps * stepCal)/calCcal;
    }
}
