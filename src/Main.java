public class Main {
    public static void main(String[] args) {

        int startAmount = 100;
        int amount = 1100;
        boolean deposit = amount > 1000;
        int bonus = deposit ? 100 : startAmount + amount;
        int result = startAmount + amount + amount / bonus;
        int bonusRub = deposit ? amount/100 : 0;
        System.out.println("Ваш баланс:" + result);
        System.out.println("Включая бонусы:" + bonusRub);

    }
}
