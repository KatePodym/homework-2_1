public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_676; // Стоимость билета
        int bonusMile = 20; // Количество рублей для одной бонусной мили
        int bonus = ticketPrice / bonusMile;
        System.out.println("Вам начислено " + bonus + " бонусов");
    }
}