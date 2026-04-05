import java.util.*;
public class GrayCode
{
    public static String toBinary(int num,int n){
        String result="";
        for(int i=n-1;i>=0;i--){
            if((num&(1<<i))!=0){
                result=result+"1";
            }else{
                result=result+"0";
            }
        }
        return result;
    }
    public static List<String>generateGray(int n){
        List<String>result=new ArrayList<>();
        int total=1<<n;

        for(int i=0;i<total;i++){
            int gray=i^(i>>1);

            String binary=toBinary(gray,n);

            result.add(binary);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int n=3;
        List<String>ans=generateGray(n);
        for(String s: ans)
        {
            System.out.println(s);
        }

    }
}
