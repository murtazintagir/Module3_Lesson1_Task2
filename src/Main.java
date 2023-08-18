import Flowershop.Flowers.Flower;
import Flowershop.Flowers.Rose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flower[] bouquet = new Flower[100];
        Flower test = new Rose();
        int num = 5;
        for (int i = 0; i < num; i++) {
            bouquet[i] = new Rose();
            System.out.println(bouquet[i].toString());
        }
//        Scanner scan = new Scanner(System.in);
//        String ch;
//        do {
//            System.out.println("Введите символ");
//            ch = scan.next();
//            System.out.println(ch);
//        } while (!ch.equals("q"));
//        scan.close();
    }
}