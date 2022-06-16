public class BonusMilesService {

    public int calculate(int price) {

        int miles;
        int rubMiles = 20;
        miles = price / rubMiles;

        return miles;
    }

}


