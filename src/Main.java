// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your age? ");
        Scanner sc = new Scanner (System.in);
        int age = 18;
        double ticket_price = 40;
        boolean isThursday = false;
        String isWarsaw = "Warsaw";

        Age age1 = new Age();

        age1.setAge(age);

        int age2 = age1.age;
//        if (age < 10) {
//            ticket_price = 0;
//        } else if (age >= 10 && age <= 18) {
//            ticket_price = ticket_price * 0.5;
//
//        }
//        if (isWarsaw) {
//            ticket_price = ticket_price - (ticket_price * 0.1);
//        }
//        if (isThursday) {
//            ticket_price = 0;
//
//
        double discount =Getdiscount(age2, isWarsaw, isThursday);
        if (discount==1.0){
            ticket_price=0;
        }
        if (discount>0){
            ticket_price*=discount;
        }
        System.out.println("Ticket price: " + ticket_price);
        System.out.println("Data: " + isWarsaw + ", " + age2 +" years old, weekday ticket price: " + ticket_price + "PLN");
        System.out.println("Discount:" + discount*100  + "%");
    }

    public static double Getdiscount(int age2, String isWarsaw, boolean isThursday) {
        if (age2 < 10) return 1;
        if (isThursday) return 1;
        double discount = 0;
        if (age2<=18){
            discount =0.5;

        }
       if (isWarsaw.equals("Warsaw")){
           discount =discount+0.1;
       }
       return discount;
    }
}
