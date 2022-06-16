public class BonusMilesService {

    public int calculate(int cost) {
        int price = cost;
        int rubMiles = 20;
        int miles = price / rubMiles;
        return miles;
    }

}
