package hangmanbot;
import hangmanbot.MostCommonChar;
import hangmanbot.WordLengthNumber;
import hangmanbot.Cull;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.*;

public class GameInteract {
    public static int length;
    public static String[] usedLetter = new String[26];
    public static String[] abc = new String[26];
    public static String fileloc="../../../current words.txt";
    public static File curList= new File (fileloc);
    public static int globalI =0;
    public static int mistake = 0;
    
    public static void main (String[]args){
        //initializing arrays
        for (int i = 0; i<26; i++){
            usedLetter[i]=" ";
        }
        for (int i = 0; i<26;i++){
            abc [i]=Character.toString((char) i+97);
        }
        
        System.out.println("How many letters does your word contain");
        Scanner input1 = new Scanner(System.in);
        int input = input1.nextInt();
        System.out.println("There are "+ WordLengthNumber.Calculate(input) + " words that "
                + "have " + input + " letters");
        length = WordLengthNumber.Calculate(input);
        
        while (true){
           String letter = MostCommonChar.Calculate();
           usedLetter[globalI]=letter;
           globalI++;
           System.out.println("Does this word contain the letter " + letter);
           int letterLoc = input1.nextInt();
           if (letterLoc==0){
               mistake++;
               Cull.Calculate(letter);
               
           }
           else if (letterLoc>0){
               while (letterLoc!=0){
               Cull.Calculate(letter, letterLoc);
               
               System.out.println("Does this word contain another letter " + letter);
               Scanner input2 = new Scanner(System.in);
               letterLoc = input2.nextInt();
               }
           }
           System.out.println("I made " + mistake + " mistakes.");
       }
    }
}