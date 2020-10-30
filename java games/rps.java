  import java.util.Random; // importing the random
  import java.util.Scanner; // importing the scanner

  class rps { // class rps_game, as the name of the file is rps_game.java
    public static void main (String[] args) // main method
    {
      String comp = ""; // The computer's play, yet to be defined

      Boolean game = true; // boolean variable game, loops the game while the user wants to 

      int wcnt = 0; // win count
      int lcnt = 0; // lose count
      int tcnt = 0; // tie count


      Scanner scan = new Scanner(System.in); // main scanner
      Random generator = new Random(); // generator for computer's play

      do { // start of loop using the do function
        
        System.out.println("Wins: " + wcnt + " Ties: " + tcnt + " Losses: " + lcnt); // gives the win/loss/tie count
        System.out.println("RPS - \n r for Rock \n p for Paper \n s for Scissors \n **NOT CASE SENSITIVE!***"); // giving the user the options for rps
        
        int computerInt = generator.nextInt(3)+1; // generating the integers 1, 2, or 3
        
        if (computerInt == 1) // if the integer generated is 1
          comp = "R"; // the computer play is R, rock
        
        else if (computerInt == 2) // otherwise if it is 2
          comp = "P"; //the computer play is P, paper
        
        else if (computerInt == 3) // otherwise again if it is 3
          comp = "S"; // the computer play is S, scissors
        
        System.out.println("Enter your play: "); // asks the user to enter the play
        String userp = scan.nextLine(); // scans for next line, defining the users play
        
        userp = userp.toUpperCase(); // user play is user play to uppercase for ease 
        
        System.out.println("Computer play is: " + comp); // shows the computers play

        if (!userp.equals("R") && !userp.equals("P") && !userp.equals("S")) { // if the user does not put r, p or s
          System.out.println("Invalid input! Next time put r, p , or s!"); // tells the user that its invalid
          break; // exits loop
        }
      
        if (userp.equals(comp)) // if the user play is the same as the computers play
        {
          System.out.println("It's a tie!"); // tells the user it is a tie
          tcnt = tcnt + 1;  // ties + 1, example, 0 is now 0 + 1
        }

        if (userp.equals("P")){ // if the user play is P, paper
          if(comp.equals("S")) { // if the computer play is S, scissors
              System.out.println("You lose!"); // tells the user he/she lost
              lcnt = lcnt + 1; // losses + 1, example, 0 is now 0 + 1
        }
          if(comp.equals("R")) { // if the computer play is R, rock
              System.out.println("You win!"); // tells the user he/she won
              wcnt = wcnt + 1; // wins + 1,  example, 0 is now 0 + 1
  
            }
  
        }
      
        if (userp.equals("R")){ // if the user chose rock
          
          if(comp.equals("P")) { // if the computer chose paper 
              System.out.println("You lose!"); // tells the user he/she lost
              lcnt = lcnt + 1; // losses + 1 
        }
          
        if(comp.equals("S")) { // if the computer chose scissors
              System.out.println("You win!");
              wcnt = wcnt + 1;
        }
  
          
        }
        
        if (userp.equals("S")) { // if the user chose scissors 
          
          if(comp.equals("R")) { // if the computer chose rock
              System.out.println("You lose!"); // tells the user he/she lost
              lcnt = lcnt + 1; // losses + 1, example, 0 is now 0 + 1
              }
          
          
          if(comp.equals("P")) { // if the computer chose paper
              System.out.println("You win!"); // tells the user he/she won
              wcnt = wcnt + 1; // wins + 1, example, 0 is now 0 + 1
            }
  
        }


        
        System.out.println("Would you like to play again (yes/no): "); // asking if the user wants to play again
        
        String choice = scan.nextLine(); // reads the choice using the scanner "scan"
        
        if (choice.equalsIgnoreCase("yes")) // if the user chooses yes
        {
          continue; // continues the loop
        } 
        else 
        {
          System.out.println("Game Over!"); // ends the game 
          scan.close(); // closes the scanner as it is no longer needed
          break; // breaks the loop
        }
      } while(game); // as used from before, for "do" to work, the while function is used for the previously used game 
    }
  }


