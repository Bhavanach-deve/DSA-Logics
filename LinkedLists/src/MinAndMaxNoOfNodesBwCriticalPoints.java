//A node is critical if it is:
//Local Maximum
//prev < curr > next
//Local Minimum
//prev > curr < next
//First and last node can never be critical.

class No{
    int data;
    No next;

    No(int data){
        this.data=data;
        this.next=null;
    }
}
public class MinAndMaxNoOfNodesBwCriticalPoints
{
    public static int[] criticalPoints(No head){
        int first=-1;
        int prevCritical=-1;
        int minDist=Integer.MAX_VALUE;
        int index=1;

        No prev=head;
        No curr=head.next;

        while(curr.next!=null){
            boolean isCritical=
                    (curr.data>prev.data&&curr.data>curr.next.data)||(curr.data<prev.data&&curr.data<curr.next.data);
            if(isCritical){
                if(first==-1)
                    first=index;
                if(prevCritical!=-1)
                    minDist=Math.min(minDist,index-prevCritical);
                prevCritical=index;
            }

            prev=curr;
            curr=curr.next;
            index++;
        }
        if(first==prevCritical)
            return new int[]{-1,-1};

        return new int[]{minDist,prevCritical-first};
    }

    public static void main(String[] args)
    {
        No n=new No(5);
        n.next=new No(3);
        n.next.next=new No(1);
        n.next.next.next=new No(2);
        n.next.next.next.next=new No(5);
        n.next.next.next.next.next=new No(1);
        n.next.next.next.next.next.next=new No(2);

        int[]ans=criticalPoints(n);
        System.out.println("Min= "+ans[0]);
        System.out.println("Max= "+ans[1]);

    }
}
