//Given an array of car numbers car[], an array of penalties fine[], and an integer date, determine the total fine collected on that date. The fine is collected based on parity, i.e., on an even date, fines are collected from odd-numbered cars, and on an odd date, fines are collected from even-numbered cars.
public class FindTheFine
{
    public static long totalFine(int date,int car[],int fine[])
    {
        long amount=0;
        for(int i=0;i<car.length;i++)
        {
               if(date%2==0) {
                   if (car[i] % 2 != 0) {
                       amount += fine[i];
                   }
               }
               else{
                   if(car[i]%2==0){
                       amount+=fine[i];
                   }
               }
        }
        return amount;
    }

   public static void main(String[] args)
   {
       int n=8;
       int car[]={2222, 2223, 2224};
       int fine[]={200,300,400};
       System.out.println(totalFine(n,car,fine));


    }
}
