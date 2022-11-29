package hangmanbot;
import hangmanbot.GameInteract;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.*;

public class End extends GameInteract{
    public static void Finish(){
        try {
            Scanner file = new Scanner(new File(fileloc));
            String currentLine = file.nextLine();
            System.out.println("Your word is "+ currentLine);
            System.out.println("I made " + mistake + " mistakes guessing this word");
            System.exit(0);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
