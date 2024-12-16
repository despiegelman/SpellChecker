import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpellChecker
   {
      private String[] dictionary;

      public SpellChecker() {
        try
        {
            dictionary = readLines("dictionary.txt");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());              
        }
        
      }

      public static String[] readLines(String filename) throws IOException 
      {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
      }

    public boolean spellcheck(String word) {
        for (int i = 0; i < dictionary.length; i++){
            if (dictionary[i].equals(word)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }





    public void printStartsWith(String string) {
    }

    public void print10(){
        for (int num=0; num<10; num++){
        System.out.println(dictionary[num]);
        }
    }
      
    
   }