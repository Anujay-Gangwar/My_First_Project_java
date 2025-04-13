

import java.util.Scanner;

    public class numIsIntegerOrNot
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt())
            {
                System.out.println(sc.nextInt()+" is valid Integer ");
            }


        }
    }
