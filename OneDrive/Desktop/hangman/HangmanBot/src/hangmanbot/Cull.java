package hangmanbot;
import hangmanbot.End;
import hangmanbot.GameInteract;
import static hangmanbot.GameInteract.fileloc;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.nio.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cull extends GameInteract {
    public static void Calculate (String letter){
        int numwords=0;
        File tempfile = new File ("../../../temp.txt");
        
        try{
            FileWriter fw = new FileWriter("../../../all words.txt");
            tempfile.createNewFile();
            Scanner file = new Scanner(new File(fileloc));
           
            while (file.hasNextLine()){
                String currentLine=file.nextLine();

                if (!currentLine.contains(letter)){
                    fw.write(currentLine);
                    fw.write("\n");
                    numwords++;
                }
            }
            
                       
            File delFile = new File(fileloc);
            delFile.delete();
            File curList = new File (fileloc);
            curList.createNewFile();
            
        fw.close();
        }catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("There are " + numwords + " words left");
        length=numwords;
        Cull.copy();
        if(length==1){
            End.Finish();
        }
    }
    
    public static void Calculate(String letter, int letterLoc){
        int numwords=0;
        File tempfile = new File ("C:\\Users\\adiem\\OneDrive\\Desktop\\netbeans\\temp.txt");
        
        try{
            FileWriter fw = new FileWriter("C:\\Users\\adiem\\OneDrive\\Desktop\\netbeans\\temp.txt");
            tempfile.createNewFile();
            Scanner file = new Scanner(new File(fileloc));
            
            while (file.hasNextLine()){
                String currentLine=file.nextLine();

                if (currentLine.charAt(letterLoc-1)==letter.charAt(0)){
                    fw.write(currentLine);
                    fw.write("\n");
                    numwords++;
                }
            }
            
                       
            File delFile = new File(fileloc);
            delFile.delete();
            File curList = new File (fileloc);
            curList.createNewFile();
            
        fw.close();
        }catch (FileNotFoundException e){
            System.out.println("File does not exist");
        }
        catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("There are " + numwords + " words left");
        length=numwords;
        
        Cull.copy();
        if(length==1){
            End.Finish();
        }
    }
    
    public static void copy(){
        InputStream is = null;
        OutputStream os = null;
        try{
           
            is = new FileInputStream("C:\\Users\\adiem\\OneDrive\\Desktop\\netbeans\\temp.txt");
            os = new FileOutputStream(fileloc);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } 
        catch (Exception ex) {
                System.out.println("Error");
        } 
        finally {
            try {
                is.close();
                os.close();
            }
            catch (IOException ex) {
                System.out.println("Error");
            }
        }
    }
}
