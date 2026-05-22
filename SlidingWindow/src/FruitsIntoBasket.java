//MaxLength of SubArray with at most 2 types of numbers
//You are given an integer array fruits where:
//fruits[i] represents the type of fruit on the i-th tree.
//You have 2 baskets.
//Each basket can hold only one type of fruit, but any quantity of that type.
//You start from any tree and move to the right continuously.
//Your task is to find the maximum number of fruits you can collect such that:
//You pick exactly one fruit from each tree.
//You can carry fruits of at most 2 different types.
//Return the maximum number of fruits collected.
import java.util.*;
public class FruitsIntoBasket
{
    public static int totalFruits(int[]fruits){
        HashMap<Integer,Integer>map=new HashMap<>();

        int l=0;
        int maxLen=0;

        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);

                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[]fruits={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruits(fruits));

    }

}
