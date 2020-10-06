import java.util.Scanner;

/**
 * calculates interest
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user to enter their starting balance and declare a variable to store the amount
    System.out.println("Please enter a starting balance");

    double balance = input.nextDouble();

    //ask user for the interest rate and declare a variable to store it
    System.out.println("Please enter your interest rate");

    int interest = input.nextInt();
    double interestRate = interest*0.01;

    //ask user hwo long they will invest and declare a variable to store the number
    System.out.println("Please enter the number of years you will invest for");

    int years = input.nextInt();
    
    for(int count = 1; count <= years; count++){
      balance = balance + (balance*interestRate);
      
    }
    System.out.println(balance);
    }
  }

