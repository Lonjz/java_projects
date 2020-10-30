import java.util.Scanner; // importing scanner

public class frequencies { // frequencies.java

    public static void main(String[] args) { // main method
        
        Scanner read = new Scanner(System.in); // declaring scanner with name "read"

        int[] number = new int[999]; // the numbers user enters stored in an array
        int i = 0; // counting integer i
        


        int[] amt = new int[10];
        amt[0] = 0;  amt[1] = 0;  amt[2] = 0;  amt[3] = 0;  amt[4] = 0;  amt[5] = 0;  amt[6] = 0;  amt[7] = 0;  amt[8] = 0;  amt[9] = 0;
        // the range of the numbers from the array integer "number". ten being 1-10, twn 1-20, etc.

        do { // do loop

            i++; // i = i + 1
            System.out.print("Enter the number(s): "); // tells the user to enter the numbers
            number[i] = read.nextInt(); // assigamt[8]g value to the elements 

            if(number[i] >= 1 && number[i] <= 10) amt[0] = amt[0] + 1; // it the number is in range of 1-10 adds 1
            if(number[i] >= 11 && number[i] <= 20) amt[1] = amt[1] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 21 && number[i] <= 30) amt[2] = amt[2] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 31 && number[i] <= 40) amt[3] = amt[3] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 41 && number[i] <= 50) amt[4] = amt[4] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 51 && number[i] <= 60) amt[5] = amt[5] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 61 && number[i] <= 70) amt[6] = amt[6] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 71 && number[i] <= 80) amt[7] = amt[7] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 81 && number[i] <= 90) amt[8] = amt[8] + 1; // it the number is in range of adds 1 to the assigned variable
            if(number[i] >= 91 && number[i] <= 100) amt[9] = amt[9] + 1; // it the number is in range of adds 1 to the assigned variable


    } while(number[i] > 0); // do loop while the statement is true

    read.close(); // closes the scanner read as it will not be needed

    
    String[] asterisk = new String[10];
    asterisk[0] =""; asterisk[1] =""; asterisk[2] =""; asterisk[3] =""; asterisk[4] =""; asterisk[5] =""; asterisk[6] =""; asterisk[7] =""; asterisk[8] =""; asterisk[9] =""; 
    // strings for the asterisks 10 differents ones for the ranges

    int abc = 0; // counting variable
    do { // do loop
        abc++; // abc = abc + 1
        asterisk[0] = asterisk[0] + "*"; // assigamt[8]g an asterisk for each
        if (amt[0] == 0) { // if the range has 0 numbers
            asterisk[0] = ""; // this is here because the loop would work and even if you didnt put a number in range an asterisk would still appear  
            break; // breaks from the loop
        }
    } while (abc < amt[0]); // while the counting var is less than the amount of numbers in that range

    int bcd = 0; // counting variable 2
    do { // do loop
        bcd++; // bcd = bcs + 1
        asterisk[1] = asterisk[1] + "*"; // assigamt[8]g asterisk for each 
        if (amt[1] == 0) { // if the range has 0 numbers
            asterisk[1] = ""; // explained on the first do loop
            break; // breaks from loop
        }
    } while (bcd < amt[1]); // while the counting var is less than the ammount of numbers in this range

    
    // ALL THE OTHER LOOPS FOLLOW EVERYTHING STATED ABOVE 


    int cde = 0;
    do {
        cde++;
        asterisk[2] = asterisk[2] + "*";
        if (amt[2] == 0) {
            asterisk[2] = "";
            break;
        }
    } while (cde < amt[2]);

    int def = 0;
    do {
        def++;
        asterisk[3] = asterisk[3] + "*";
        if (amt[3] == 0) {
            asterisk[3] = "";
            break;
        }
    } while (def < amt[3]);

    int efg = 0;
    do {
        efg++;
        asterisk[4] = asterisk[4] + "*";
        if (amt[4] == 0) {
            asterisk[4] = "";
            break;
        }
    } while (efg < amt[4]);
    
    int fgh = 0;
    do {
        fgh++;
        asterisk[5] = asterisk[5] + "*";
        if (amt[5] == 0) {
            asterisk[5] = "";
            break;
        }
    } while (fgh < amt[5]);

    int ghi = 0;
    do {
        ghi++;
        asterisk[6] = asterisk[6] + "*";
        if (amt[6] == 0) {
            asterisk[6] = "";
            break;
        }
    } while (ghi < amt[6]);

    int hij = 0;
    do {
        hij++;
        asterisk[7] = asterisk[7] + "*";
        if (amt[7] == 0) {
            asterisk[7] = "";
            break;
        }
    } while (hij < amt[7]);

    int ijk = 0;
    do {
        ijk++;
        asterisk[8] = asterisk[8] + "*";
        if (amt[8] == 0) {
            asterisk[8] = "";
            break;
        }
    } while (ijk < amt[8]);

    int jkl = 0;
    do {
        jkl++;
        asterisk[9] = asterisk[9] + "*";
        if (amt[9] == 0) {
            asterisk[9] = "";
            break;
        }
    } while (jkl < amt[9]);


    System.out.println("<----Histogram of Frequencies---->"); // nice little header
    System.out.println("1 - 10   |  " + asterisk[0]); 
    System.out.println("11 - 20  |  " + asterisk[1]); 
    System.out.println("21 - 30  |  " + asterisk[2]);
    System.out.println("31 - 40  |  " + asterisk[3]);
    System.out.println("41 - 50  |  " + asterisk[4]);
    System.out.println("51 - 60  |  " + asterisk[5]);
    System.out.println("61 - 70  |  " + asterisk[6]);
    System.out.println("71 - 80  |  " + asterisk[7]);
    System.out.println("81 - 90  |  " + asterisk[8]);
    System.out.println("91 - 100 |  " + asterisk[9]);
    // printing ranges + the amount of asterisks in each string 
    

}
}