public class Main {
    public static void main(String[] args) {
        //численные значения в копейках
        int amount = 1200_00;
        int account = 100_00;
        int bonus;
        if (amount > 1000_00) {
            bonus =  amount / 100;
            System.out.println("Начислено бонусов " + bonus / 100);

        } else {
            bonus = 0;
            System.out.println("Бонусы не начислены");

        }
        int balance = amount + account + bonus;
        System.out.println("Баланс " + balance / 100);


    }
}
