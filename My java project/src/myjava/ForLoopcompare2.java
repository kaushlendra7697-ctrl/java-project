package myjava;

import java.util.Scanner;

public class ForLoopcompare2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("Greater no is " + a);
        }
            else if (a<b){
                System.out.println("Greater no is" +b);
            }
            else  {
            System.out.println("Both are equal");
        }
        }

    }





