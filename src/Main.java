public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int addSum = 2222;
        int newBalance = currentBalance + addSum;
        byte oneBonus = 100;
        int totalBonus = (newBalance - currentBalance)/oneBonus;
        int totalBalance = newBalance + totalBonus;
        if (addSum < 1000) {
            totalBonus = 0;
        }
        System.out.println("Баланс: " + totalBalance + " руб., " + totalBonus + " бонусных руб.");
    }
}
