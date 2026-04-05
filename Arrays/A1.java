public class A1 {
    public static int[] twoSum(int[]arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,6,4};
        int target=5;
        int result[]=twoSum(arr,target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);


    }
}
