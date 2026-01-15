package myjava;

import java.util.Scanner;

public class RadiousInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double radi = (3.14*a*a);
        System.out.println("Area of circle"+ radi);
        System.out.println("Radi of circle"+ a);
    }
}
