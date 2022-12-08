/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ISAIAH SHELL
 */
import java.util.Random;
import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {

        int num = 0;

        while (num < 1) {
            System.out.println("From range 0 to 5 Guess the output");
            Scanner scn = new Scanner(System.in);
            int input = scn.nextInt();

            Random randomnum = new Random();
            int ran = randomnum.nextInt(6);
            if (input == ran) {
                System.out.println(" Correct you are smart");

            } else {
                System.out.println(" oopss you are dull than the program");
            }

            System.out.println(ran + " was actually the answer");
        }
    }
}
