public class Main {
    public static void main(String[] args) {
        int minSumAdded = 500; // min сумма пополнения
        int oneBonus = 50; //1 рублю за каждые полные 50 рублей пополнения
        int addedAmount = 1000; // сумма пополнения
        int bonus;
        int finalAccountBalance;
        int startBalance = 200;

        //формулы
        if (addedAmount >= minSumAdded) {
            bonus = addedAmount / oneBonus;
            finalAccountBalance = startBalance + addedAmount + bonus;
            System.out.println("Вы получили " + bonus + " бонусных рублей. Теперь баланс Вашего счета составляет " + finalAccountBalance +" рублей");
        } else {
            System.out.println("Баланс Вашего счета составляет " + (startBalance + addedAmount) + " рублей.");
        }
    }
} 