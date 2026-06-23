//There are infinitely many people standing in a row, indexed from 1. The strength of the person at index i is i².
//Given a strength p, determine the maximum number of people that can be defeated. A person with strength x can be defeated only if p ≥ x, after which the strength p decreases by x.
public class MaximumNoOfPeopleDefeated
{
    public static int MaxplpDefeated(int p)
    {
        int count=0;
        int i=1;
        while(p>=i*i){
            p=p-i*i;
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(MaxplpDefeated(14));

    }
}
