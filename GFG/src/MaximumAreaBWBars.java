//Given an integer array height[], where height[i] represents the height of the ith bar arranged in a row, find the maximum rectangular area that can be formed by selecting any two bars. The area is calculated based on the original positions of the selected bars.
import java.util.ArrayList;
import java.util.List;

public class MaximumAreaBWBars
{
    public static int maxArea(List<Integer> height)
    {
        int l=0;
        int r=height.size()-1;
        int maxiArea=0;
        while(l<r){
            int width=r-l-1;
            int area=Math.min(height.get(l), height.get(r))*width;
            maxiArea=Math.max(maxiArea,area);

            if(l<r){
                l++;
            }
            else{
                r--;
            }
        }
        return maxiArea;
    }

    static void main(String[] args)
    {
        List<Integer>l=new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(7);
        System.out.println(l);
        System.out.println(maxArea(l));

    }
}
