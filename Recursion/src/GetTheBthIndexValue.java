//On the first row, we write a 0. Now in every subsequest row, we look at the previous row and replace each occurrence of 0 with 01 and each occurrence of 1 with 10. Given row number A and index B, return the Bth indexed symbol in row A. eg: 0 01 010110
public class GetTheBthIndexValue
{
    public static String modifyString(String s){
        //0-01
        //1-10
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                sb.append("01");

            }
            else{
                sb.append("10");
            }
        }
        return sb.toString();
    }
    public static int generate(String s,int i,int A,int B){
        if(i==A){
            return (int)(s.charAt(B)-'0');//This is about how you convert characterdigit into integer char B=2 //ASCII values '0'-48,'1'-49,'2'-50, '3'-51
        }
        System.out.println(s);
        String s1=modifyString(s);
        return generate(s1,i+1,A,B);

    }

    public static void main(String[] args)
    {
        System.out.println(generate("0",0,5,2));
        //System.out.println(modifyString("0110"));

    }
}
