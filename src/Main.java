import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by admin on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> wordMap = new HashMap<String,Integer>();

    try (Scanner s=new Scanner(new File("C:\\Users\\admin\\Downloads\\q.txt"),"UTF-8")){
        while(s.hasNext()){
            String word=s.next().toLowerCase();
            if (wordMap.get(word) != null){
                wordMap.put(word, wordMap.get(word)+1);
            } else{
                wordMap.put(word,1);
            }
        }
    }
    for (Map.Entry<String,Integer> entry: wordMap.entrySet()){
        System.out.println("Слово = " + entry.getKey() + " Количество = " + entry.getValue());
    }
        ArrayList<Map.Entry<String,Integer>>list=new ArrayList<Map.Entry<String,Integer>>();
    }

}
