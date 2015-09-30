/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPD3314BuildIt42015F;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author c0587637
 */
public class CPD3314BuildIt42015F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Celsius/Fahrenheit/Kelvin Example
        double C = 0, F = C * 9 / 5 + 32, K = C + 273.15;
        System.out.printf("%10s%10s%10s\n", "C", "F", "K");
        System.out.printf("%10.1f%10.1f%10.1f\n", C, F, K);
        C = 1;
        F = C * 9 / 5 + 32;
        K = C + 273.15;
        System.out.printf("%10.1f%10.1f%10.1f\n", C, F, K);
        C = 2;
        F = C * 9 / 5 + 32;
        K = C + 273.15;
        System.out.printf("%10.1f%10.1f%10.1f\n", C, F, K);

        // Print 1-10
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // Celsius Table w/ Loop
        C = 0;
        F = C * 9 / 5 + 32;
        K = C + 273.15;
        System.out.printf("%10s%10s%10s\n", "C", "F", "K");
        while (C <= 100) {
            System.out.printf("%10.1f%10.1f%10.1f\n", C, F, K);
            C++;
            F = C * 9 / 5 + 32;
            K = C + 273.15;
        }

        // Count to Ten Do-While
        int y = 1;
        do {
            System.out.println(y);
            y++;
        } while (y <= 10);

        // Guessing Game
        Scanner kb = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Enter a Number 1-10");
            guess = kb.nextInt();
            kb.nextLine(); // Clears NewLine character from buffer
            if (guess < 1 || guess > 10) {
                System.out.println("Please enter a number 1-10.");
            }
        } while (guess != 3);
        System.out.println("Congrats You Win!");

        // Count 1-10 For Loop
        for (int z = 1; z <= 10; z++) {
            System.out.println(z);
        }

        // For Loop Temperatures
        System.out.printf("%10s%10s%10s\n", "C", "F", "K");
        for (double celsius = 0; celsius <= 100; celsius++) {
            System.out.printf("%10.1f%10.1f%10.1f\n",
                    celsius,
                    celsius * 9 / 5 + 32,
                    celsius + 273.15);
        }

        // Factorial For Loop
        int factorial = 1;
        for (int z = 1; z <= 5; z++) {
            factorial *= z;
        }
        System.out.println(factorial);

        // Average of Sum to 1000
        double sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum / 1000);

        // Mimic Program
        String input;
        do {
            System.out.println("Enter Some Text ('exit' to exit):");
            input = kb.nextLine();
            System.out.println(input);
        } while (!input.equals("exit"));

        // Multiplication Table
        for (int x1 = 0; x1 < 10; x1++) {
            for (int y1 = 0; y1 < 10; y1++) {
                System.out.print((x1 * y1) + "\t");
            }
            System.out.println("");
        }
        
        // Sample File Input/Output
        FileWriter file = new FileWriter("out.txt", true);
        PrintWriter out = new PrintWriter(file);
        out.println("Hello World!");
        out.println("I can write as much as I want between opening and closing the file.");
        out.close();
        
        out = new PrintWriter(file);
        out.println("Second Running.");
        out.close();
        
        File f = new File("in.txt");
        Scanner inFile = new Scanner(f);
        System.out.println(inFile.nextLine());
        inFile.close();
        
        // Sample Random Numbers
        Random rng = new Random();
        System.out.println(rng.nextInt());
        System.out.println(rng.nextDouble());
        System.out.println(rng.nextInt(10));
        
        // Random String Example
        PrintWriter outFile = new PrintWriter("random.txt");
        for (int i = 0; i < 100; i++) {
            outFile.print((char)(rng.nextInt(126-32) + 32));
        }
        outFile.println();
        outFile.close();
    }

}
