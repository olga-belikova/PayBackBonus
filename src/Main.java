public class Main {
    public static void main(String[] args) {

       int account = 500;
       int payment = 1000;

       int bonus;
       if (payment > 1000) {
           bonus = payment / 100;
       } else {
           bonus = 0;
       }

       System.out.println("Начислено бонусов: " + bonus);
       System.out.println("Итоговая сумма на счету: " + (account + payment + bonus) );

    }
}