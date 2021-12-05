public class Strings {
    public static void main(String[] args) {
        System.out.println(newString("xmen xforce","",0,'x'));
    }
    public static String newString(String old,String newString,int count,char ch){
        if(newString.length()==old.length()){
            return newString;
        }
        if (old.charAt(count) == ch ){
            newString= newString+"y";

        }
        if (old.charAt(count)!=ch){
            newString= newString + old.charAt(count);
        }
        return newString(old,newString,count +1,ch);
    }
}
