public class Main {
    public static void main(String[] args) {
        //численные значения считаются в копейках
        int amount = 1000_00;
        int account = 50_00;
        int bonus = 1_00;
        int step = 100_00;
        int totalBonus = amount / (step / bonus);
        int amountAccount = amount + account;
        int totalAccount = totalBonus + amountAccount;
        if (amount >= 1000_00) {
            System.out.println("Баланс " + totalAccount / 100);
            System.out.println("Начислено бонусов " + totalBonus / 100);
        } else {
            System.out.println("Баланс " + amountAccount / 100);
            System.out.println("Бонусов не начислено");
        }
    }
}
