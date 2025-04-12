import java.util.*;

public class methods_of_strings
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        str = sc.nextLine();
        int len = str.length();                                       //length of a string
        System.out.println("Length og a string : " +len);
        System.out.println("In upper case : "+str.toUpperCase());                                  //converts string into upper case
        System.out.println("In lower case : "+str.toLowerCase());                                 //converts string into lower case
        System.out.println("After trimming : "+str.trim());                                      // remove all leading and trailing spaces
        System.out.println("Substring : "+str.substring(6,12));                                 //return a substring but excluding last index
        System.out.println("replace a char : "+str.replace('g','b'));                //replacing a character
        System.out.println("replace a word : "+str.replace("boy","girl"));       // replacing a word
        System.out.println("starts with : "+str.startsWith("He"));                                   //returns true if it starts with given string
        System.out.println("Ends with : "+str.startsWith("boy"));                                  //returns true if it ends with given string
        System.out.println(str.charAt(4));                                                         // returns char at given index
        System.out.println(str.indexOf("n"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.equals("anujay"));
        System.out.println(str.equalsIgnoreCase("anujay"));




    }
}
