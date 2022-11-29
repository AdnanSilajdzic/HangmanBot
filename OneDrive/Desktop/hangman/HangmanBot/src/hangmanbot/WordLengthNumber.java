package hangmanbot;

import hangmanbot.GameInteract;
import static hangmanbot.GameInteract.fileloc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WordLengthNumber extends GameInteract  {
    
    public static int Calculate(int a){
        
        curList.delete();
        int numwords = 0;
        
        try{
            FileWriter fw = new FileWriter(fileloc);
            curList.createNewFile();
            //Enter your unique file path
            Scanner source = new Scanner(new File("C:\\Users\\adiem\\OneDrive\\Desktop\\hangman\\words2.txt"));
            
            while (source.hasNextLine()){
            String currentLine=source.nextLine();
            if (currentLine.length()==a){
                fw.write(currentLine);
                fw.write("\n");
                numwords++;
            }
        }
            
        fw.close();
        }catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        catch (IOException e){
            System.out.println("Error");
        }
        
        return numwords;
    }
}
