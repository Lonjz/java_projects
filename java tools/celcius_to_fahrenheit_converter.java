import java.util.InputMismatchException; //deploying InputMismatchException to catch if the user puts fahrenheit as a noninteger value
import java.util.Scanner; //deploying the scanner to read for farenheit

class celcius_to_fahrenheit_converter { // run script for the file, converter.java
     public static void main (String[] args) 
   {
    try { //trying the code
       
    double fahrenheit; //declaring fahrenheit as a double, with no value yet
 
    Scanner read = new Scanner(System.in); //scanner named read scanning for the farenheit value the user puts
    System.out.println("Enter a fahrenheit value"); //printing an instruction for the user to follow 
   

    fahrenheit = read.nextDouble(); //giving the previously declared double, fahrenheit, a value 
    
    read.close(); //closing the scanner named read

    double celsius = ((fahrenheit-32)*5/9); //declaring the value of the celsius output as a double
    System.out.println("The value of " + fahrenheit + " Fahrenheit in Celsius is " + celsius); //printing the celsius value 

   } catch (InputMismatchException X) { //catching the error previously imported
     
    System.out.println("Enter the fahrenheit value as an **INTEGER**!"); //outcome of what happens on the catch

   }
  }
}