package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean a = true;
        Scanner scnr = new Scanner(System.in);
        int b = 1;

        while (a = true) {
            System.out.println("Enter an interger grade or enter '0' to exit: ");
            b = scnr.nextInt();

            if (b >= 90)
            {
                System.out.println("A");
            }

            else if (b >= 80 && b < 90)
            {
                System.out.println("B");
            }

            else if (b >= 70 && b < 80)
            {
                System.out.println("B");
            }

            else if (b >= 60 && b < 70)
            {
                System.out.println("C");
            }

            else if (b <= 0)
            {
                break;
            }

            else
            {
                System.out.println("F");
            }

        }

    }
}
