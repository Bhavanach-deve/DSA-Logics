import java.util.Scanner;

public class A5SumOFTheRunsScoredInAnOver
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of overs:");
        int n=sc.nextInt();
        System.out.println("Enter the no.of runs scored in each over:");
        int runs[]=new int[n];
        for(int i=0;i<n;i++){
            runs[i]=sc.nextInt();
        }
        System.out.println("Enter the starting over(L):");
        int left=sc.nextInt();
        System.out.println("Enter the ending over (R):");
        int right=sc.nextInt();
        int sum=0;

        for(int i=left;i<=right;i++){
            sum=sum+runs[i];

        }
        System.out.println("The runs scored from "+left+"to "+right+"are: "+sum);
        }


    }
