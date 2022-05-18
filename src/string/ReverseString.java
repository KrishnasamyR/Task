package string;

public class ReverseString {
public String reverseRecursively(String str)
    {
        if(str.length() < 2)
        {
            return str;
        }
        return reverseRecursively (str.substring(1))+str.charAt(0);
    }

}