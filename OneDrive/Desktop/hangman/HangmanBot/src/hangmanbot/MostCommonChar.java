package hangmanbot;

import hangmanbot.GameInteract;
import static hangmanbot.GameInteract.fileloc;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class MostCommonChar extends GameInteract{
    
    public static String Calculate(){
        int localMax=0, globalMax=0, letterMax=0;
        Scanner file = null;
        
        
        for (int i=0; i<26;i++){
            boolean repeat=false;
        
            for (int j=0; j<26;j++){
                if (globalI==0)
                {break;}
                if (usedLetter[j].equals(abc[i]))
                {repeat=true;}
            }
            if (repeat==true)
            {continue;}
            
            localMax=0;
            
            try {
            file = new Scanner(new File(fileloc));
            } 
            catch (FileNotFoundException ex) {
            System.out.println("File not found");
            }
        
            while (file.hasNextLine()){
                String currentLine=file.nextLine();
                if (currentLine.contains(abc[i]))
                {localMax++;}
            }
            
            if (localMax>globalMax){
                letterMax=i;
                globalMax=localMax;
            }
            
        }
        double chance = (((double)globalMax/(double)length)*100);
        System.out.println("There is a " +(int)chance + "% chance this guess is correct");
        String guess=abc[letterMax];
        abc[letterMax]=" ";
        return guess;
    }
}