import java.util.InputMismatchException; //deploying InputMismatchException to catch if the user puts money as a noninteger value
import java.util.Scanner; //deploying the scanner to read for farenheit

class money_to_bills { // run script for the file, e.java
     public static void main (String[] args) 
   {
    try { //trying the code
       
    double money; //declaring money as a double, with no value yet
 
    Scanner read = new Scanner(System.in); //scanner named read scanning for the farenheit value the user puts
    System.out.println("Enter a money value"); //printing an instruction for the user to follow 
   

    money = read.nextDouble(); //giving the previously declared double, fahrenheit, a value 
    
    read.close(); //closing the scanner named read

    int ten, five, one, quarter, dime, nickle, penny, cents; // declaring the money methods
    cents =(int)(money * 100);
    ten = (int)(money / 10); 
    five = (int)((money - (ten*10)) / 5);
    one = (int)((money - (five*5) - (ten*10)) / 1);
    quarter = (int)((cents - (one*100) - (five*500) - (ten*1000)) / 25);
    dime = (int)((cents - (quarter*25) - (one*100) - (five*500) - (ten*1000)) / 10);
    nickle = (int)((cents - (dime*10) - (quarter*25) - (one*100) - (five*500) - (ten*1000)) / 5);
    penny = (int)((cents - (nickle*5) - (dime*10) - (quarter*25) - (one*100) - (five*500) - (ten*1000)) / 1);

    System.out.println("The value of " + money + "\n 10 Dollar bills " + ten + "\n 5 Dollar bills " + five + "\n Loonies " + one + "\n Quarters "
    + quarter + 
    "\n Nickles " + nickle + "\n Pennies " + penny); //printing the money values 

   } catch (InputMismatchException X) { //catching the error previously imported
     
    System.out.println("Enter the money value as an INTEGER!"); //outcome of what happens on the catch

   }
  }
}