public class ConversionOfLowerToUpperViceVersa
{
        public static void main(String[] args)
        {
            String str="SnAKe";
            String lower="";
            String upper="";
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                //Lower case Conversion
                if(ch>='A'&&ch<='Z'){
                    lower=lower+(char)(ch+32);
                }else{
                    lower=lower+ch;
                }
                //Lower case Conversion
                if(ch>='a'&& ch<='z'){
                    upper=upper+(char)(ch-32);
                }
                else {
                    upper=upper+ch;
                }
            }
            System.out.println("Original: "+str);
            System.out.println("Lowercase: "+lower);
            System.out.println("UpperCase: "+upper);

        }
    }
