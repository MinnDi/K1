public class Main {
    public static void main(String[] args) {
    String str="previous";
    str=switchVowels(str);
    System.out.println(str);
    }
    public static String switchVowels (String str){
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (isVowel(ch[i])) {
                for(int j=i+1;j<ch.length;j++){
                    if (isVowel(ch[j])){
                        char temp=ch[j];
                        ch[j]=ch[i];
                        ch[i]=temp;
                    }
                }
            }
        }
        str= new String(ch);
        return str;
    }
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
            else return false;
    }
}
