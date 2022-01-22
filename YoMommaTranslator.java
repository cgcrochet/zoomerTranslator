
package yomommatranslator;

//import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
//import java.util.ArrayList;


public class YoMommaTranslator {


    public static void main(String[] args) throws FileNotFoundException{
        TreeMap<String, String>  translations = new TreeMap<>();
        
        File input = new File("acronyms.txt");
        Scanner in = new Scanner(input);
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            String[] splitted = line.split("\t");
            translations.put(splitted[0], splitted[1]);
        }
//        System.out.println(translations.keySet());
        
//        Set<String> keys = translations.keySet();
//        
//        ArrayList<String> tran = new ArrayList<>();
//          
//          for (int n = 0; n < translations.size(); n++){
//              for (String key: keys) {
//                  tran.add(n, key);
//              }
//          }
//        for(String key : keys){
//            tran[]
//        }
//        for ()
//       String tran = translations.keySet().toString();
        
        System.out.println("Enter your phrase with acronyms: ");
        
        Scanner userIn = new Scanner(System.in).useDelimiter("\\s");
        String userInput = userIn.nextLine();
        String[] split = userInput.split("\\s");
        
//        for (int n = 0; n < split.length; n++){
//            System.out.println(split[n]);
//        }
//        System.out.println(translations.get(tran));
        
        for (String key : translations.keySet()) {
            for (int i = 0; i < split.length; i++) {
                if(split[i].toLowerCase().equals(key.toLowerCase())) {
                    split[i] = translations.get(key).toLowerCase();
                }
            }
        }
        
        
        
        for (int j = 0; j < split.length; j++){
            System.out.print(split[j] + " ");
        }
        
    }
}