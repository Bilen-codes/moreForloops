/*This program will print out all the odd numbers from 1-20.,
* all the even numbers from 1-20, reversez a string, all factors of users number,
* and lastly the factorial of a number.
*  */
import java.util.Scanner;
public class moreForloops {
    public static void main(String [] args ){
        Scanner sc = new Scanner (System.in);
    //prints all odd number 1-20
        int odd = 1;
        int even = 1;
        String unrev = " ";
        //String rev = "";
        int i = 0;
        char c= ' ';
        char r = ' ';
        int factor =0;
        System.out.println("odd numbers 1-20: ");
        while (odd <= 20){
            if (odd%2!=0){
                System.out.print(odd + " ");
            }
            odd++;
        }

     //prints all even numbers 1-20
        System.out.println("\nEven numbers 1-20: ");
        while (even <= 20){
            if (even %2 == 0){
                System.out.print(even + " " );

            }
            even++;
        }

        //Reverseing a string

        System.out.println("\nPlease enter a string to revers: ");
        unrev = sc.nextLine();
        char [] charArray = new char[unrev.length()];
        int rN = unrev.length()-1;
        // sc.nextLine();
        while(unrev.length() > i){
            c = unrev.charAt(i);
            //System.out.println(c + " ");
            charArray[rN] = c;
              i++;
              rN--;
        }
        //print the reveresed character array
        //int k = unrev.length()-1;
        for(int j = 0; j < unrev.length(); j++){
           System.out.print(charArray[j]);
       }

        //display all the factors of a number
        System.out.println("\nPlease enter a number to find it's factors: ");
        factor = sc.nextInt();
        int counter = 1;
        System.out.println(factor + "'s factors are :");

        while (counter < factor ){
            if ((factor%counter) == 0){
                System.out.print(counter + " ");
            }
            counter ++;
        }
        System.out.println("\n"+factor + "'s factorial is:");
        //Finds factorial of a number
        if (factor == 0){
            System.out.println("factorial of 0 is 1");
        }
        else if (factor < 0){
            System.out.println("can't find factorial of negative numbers");
        }
        else {
            int count = 1;
            int anwer = 1;
            for(i=1;i<=factor;i++){
               count=count*i;
            }
            System.out.println(count);
        }







    }
}
