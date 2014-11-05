/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7part4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexander.louck418
 */
public class Lab7Part4 {
static int score = 0;
final public static String [] prizes = {null,"nothing", "an old Shoe", "worm","good fish", "salmon", "fugu"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Fishing Simulator 2015\n");
        System.out.println("Would you like to start fishing?\n");
        fishResult();
        finalScore();
    }
    public static void fishResult()
    {
        String p;
        Scanner scan = new Scanner(System.in);
        String i = scan.next();
        while (i.equals("y"))
        {
            int dice = new Random().nextInt(6)+1;
            p = prizes[dice];
            System.out.println(p);
            score += dice;
            System.out.println("Would you like to keep fishing?");
            i = scan.next();
        }
    }
    public static void finalScore()
    {
        System.out.println("Congradulations your score is " + score);
    }
}
