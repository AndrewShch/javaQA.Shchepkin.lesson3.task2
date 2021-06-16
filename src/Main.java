public class Main {
    public static void main(String[] args) {
        //численные значения в копейках
        int amount = 900_00;
        int account = 100_00;
        int bonus = 100;
        int balance = amount + account;
        if (amount > 1000_00) {
            int bonusBalance = amount / bonus;
            int totalBalance = bonusBalance + balance;
            System.out.println("Начислено бонусов " + bonusBalance / 100);
            System.out.println("Баланс " + totalBalance / 100);
        } else {
            System.out.println("Бонусы не начислены");
            System.out.println("Баланс " + balance / 100);
        }

    }
}
