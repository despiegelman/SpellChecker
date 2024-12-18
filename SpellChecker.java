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
        boolean result = false;
        //for (int i = 0; i < dictionary.length; i++){
            //if (dictionary[i].equals(word)){
                //return true;
            //}else{
                //return false;
            //}
        //}
        for (String i : dictionary){
            if (i.equals(word)){
                result = true;
            }
        }
        return result;
    }





    public void printStartsWith(String firstLetters) {
        //for (int i = 0; i < dictionary.length; i++){
            //if (dictionary[i].startsWith(firstLetters)){
                //System.out.println(dictionary[i]);
            //}
        //}
        for (String i : dictionary){
            if (i.startsWith(firstLetters)){
                System.out.println(i);
            }
        }
    }

    public void print10(){
        //Doesn't work as a foreach loop because indexes are required in the method
        for (int num=0; num<10; num++){
            System.out.println(dictionary[num]);
        }
    }
      
    
   }