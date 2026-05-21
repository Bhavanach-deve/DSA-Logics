//Given two integers d and n. Where d is the day, out of 7 days of the week, d varies from 0 to 6 as shown below.
//0 - Sunday
//1 - Monday
//2 - Tuesday
//3 - Wednesday
//4 - Thursday
//5 - Friday
//6 - Saturday
//You have to return the index for the day which is n days before the given day d.

public class DayBeforeNDays
{
    public static int dayBefore(int d,int n)
    {
        return (d-(n%7)+7)%7;

    }

    public static void main(String[] args)
    {
        System.out.println(dayBefore(4,3));
    }
}
//Previous day → subtract
//Next day → add
//Always mod by total cycle length