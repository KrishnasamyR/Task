package string;


public class RemoveCharacter {
    
    public void removeCharacters(String stringOne,String stringTwo)
    {
        char remaining;
        String remainingOne = stringOne, search,replace="";
        for (int totalOne =0;totalOne< stringOne.length();totalOne++)
        {
            remaining = stringOne.charAt(totalOne);//0-i/1-n/2-d/3-i/4-a
            search = Character.toString(remaining);//da
           
            for (int totalTwo = 0; totalTwo < stringTwo.length();totalTwo++)//in
            {
                if (remaining == stringTwo.charAt(totalTwo))//0-i,
                {
                    remainingOne = remainingOne.replace(search,replace);//in-both replaced
                }
            }
            
        }
        System.out.println("After removing StringTwo by StringOne :"+remainingOne);
        
    }

}