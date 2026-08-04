package dsa.recursion;

public class skipastring {


    public static String skipApple(String up){ //processed , unprocessed
        if(up.isEmpty()){
            return "";
        }

        if(up.toLowerCase().startsWith("apple")){
            return skipApple(up.substring(5));

        }else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }
}
