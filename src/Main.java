public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refill = 5099;
        int bonus = refill / 100;
        int newBalance = balance + refill +bonus;

        System.out.println("Balance = " + newBalance);
        System.out.println("Bonus = " + bonus);

    }

}
