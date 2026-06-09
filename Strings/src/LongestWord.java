//Given an array arr[] containing strings of names. Your task is to return the longest string. If there are multiple names of the longest size, return the first occurring name.
import java.util.ArrayList;
import java.util.List;

public class LongestWord
{
    public static String longest(List<String>arr)
    {
        if(arr==null || arr.isEmpty()){
            return "";
        }
        String longestWord=arr.get(0);
        for(String word:arr){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args)
    {
        List<String>l=new ArrayList<>();
        l.add("Apple");
        l.add("Mango");
        l.add("Orange");
        l.add("Banana");
        String ans=longest(l);
        System.out.println(ans);


    }
}
