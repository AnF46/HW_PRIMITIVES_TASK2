public class Main {
    public static void main(String[] args) {
        int x = 500; // min сумма пополнения
        int oneBonus = 50; //1 рублю за каждые полные 50 рублей пополнения
        int z = 400;
        int addedAmount = z; // сумма пополнения
        int bonus;
        int finalAccountBalance;
        int y = 200;
        int startBalance = y;

        //формулы
        if (addedAmount >= x) {
            bonus = addedAmount / oneBonus;
            finalAccountBalance = startBalance + addedAmount + bonus;
            System.out.println("Вы получили " + bonus + "бонусных рублей. Теперь баланс Вашего счета составляет " + finalAccountBalance);
        } else {
            System.out.println("Баланс Вашего счета составляет " + (startBalance + addedAmount) + " рублей.");
        }
    }
}