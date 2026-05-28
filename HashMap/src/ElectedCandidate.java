//Given an array of names arr[] of candidates in an election. A candidate name in array represents a vote casted to the candidate. You need to find the candidate with maximum votes recieved in the election.
import java.util.HashMap;

public class ElectedCandidate
{
    public static String electionWinner(String arr[]){
        HashMap<String,Integer>hm=new HashMap<>();
        for(String name:arr){
            hm.put(name,hm.getOrDefault(name,0)+1);
        }
        String winner="";
        int maxVotes=0;

        for(String name:hm.keySet()){
            int votes=hm.get(name);
            if(votes>maxVotes){
                maxVotes=votes;
                winner=name;
            }
        }
        return winner;
    }

    public static void main(String[] args)
    {
        String arr[]={"Shrikant", "Sushma", "Rajnath", "Sushma"};
        String ans=electionWinner(arr);
        System.out.println(ans);



    }
}
