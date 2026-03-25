import java.util.Scanner;

public class A8PrefixSumOfEvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int evenSum=0;
//        int oddSum=0;
//        for(int i=1;i<n-1;i++){
//            if(i%2==0){
//                evenSum=evenSum+arr[i];
//            }
//            else{
//                oddSum=oddSum+arr[i];
//            }
//        }
//        System.out.println(evenSum);
//        System.out.println(oddSum);

//        int evenPrefix[] = new int[n];
//        int oddPrefix[] = new int[n];
//
//        evenPrefix[0] = arr[0];
//        oddPrefix[0] = 0;
//
//        for(int i = 1; i < n; i++) {
//            if(i % 2 == 0) {
//                evenPrefix[i] = evenPrefix[i-1] + arr[i];
//                oddPrefix[i] = oddPrefix[i-1];
//                System.out.println(evenPrefix[i]);
//            } else {
//                oddPrefix[i] = oddPrefix[i-1] + arr[i];
//                evenPrefix[i] = evenPrefix[i-1];
//            }
//        }
//
//    }
//}
        int evenPrefix[] = new int[n];

        evenPrefix[0] = arr[0]; // index 0 is even

        for(int i = 1; i < n; i++) {
            if(i % 2 == 0) {
                evenPrefix[i] = evenPrefix[i - 1] + arr[i];
            } else {
                evenPrefix[i] = evenPrefix[i - 1];
            }
        }

        // Step 2: Query
        System.out.println("Enter L (start index):");
        int L = sc.nextInt();

        System.out.println("Enter R (end index):");
        int R = sc.nextInt();

        int sum;
        if(L == 0) {
            sum = evenPrefix[R];
        } else {
            sum = evenPrefix[R] - evenPrefix[L - 1];
        }

        System.out.println("Sum of even indices from " + L + " to " + R + " is: " + sum);

    }
}