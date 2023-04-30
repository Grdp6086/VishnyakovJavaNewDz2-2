public class Main {
    public static void main(String[] args) {
        int replenishment = 1100;         // Пополнение счета
        int oldBalance = 100;            // Изначальный баланс
        int balance = replenishment + oldBalance; // Баланс с учетом пополнения

        System.out.println("Баланс счета клиента " + balance);

        if (replenishment > 1000) {
            int bonus = replenishment / 100;
            int bonusBalance = bonus + balance;
            System.out.println("Количество бонусов зачисленых на счет " + bonus);
            System.out.println("Баланс с учетом бонуса " + bonusBalance);
        }

    }
}