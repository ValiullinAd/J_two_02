public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int bonus = 0;
        int refill = 1500;
        int total = 0;

        if (refill >= 1100) {
            bonus = refill / 100;
        }
       /* else{
            bonus = 0;
        }*/
        total = balance + refill + bonus;
        System.out.println("bonus = " + bonus);
        System.out.println(("Total = " + total));


    }

}
