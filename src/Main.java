public class Main {
    public static void main(String[] args) {
        int amount = 20_000; // Сумма покупки
        int Rub_miles = 20; // Рублей для одной бонусной мили
        int Bonus = amount / Rub_miles; // Количество бонусных миль
        System.out.println("Количество бонусных миль: " + Bonus);

    }
}