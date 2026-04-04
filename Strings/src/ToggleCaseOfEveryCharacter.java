public class ToggleCaseOfEveryCharacter
{
    public static void main(String[] args)
    {
        String str="SnAKe";
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z') {
                //Upper -> Lower
                result = result + (char) (ch + 32);
            }
            else if(ch>='a'&&ch<='z'){
                result=result+(char)(ch-32);
            }
            else{
                result=result+ch;
            }
        }
        System.out.println("Original: "+str);
        System.out.println("Toggled:"+result);

    }
}
