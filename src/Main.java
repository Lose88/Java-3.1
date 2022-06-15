public class Main {
    public static void main(String[] args) {
        int amount = 20_000; // Сумма покупки
        int rubMiles = 20; // Рублей для одной бонусной мили
        int bonus = amount / rubMiles; // Количество бонусных миль
        System.out.println("Количество бонусных миль: " + bonus);

    }
}