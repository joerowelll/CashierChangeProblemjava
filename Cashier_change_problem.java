import java.util.Scanner;
import java.lang.Math;


public class cashRegister {


	public static void main(String[] args) {
	// get input from cashier	
	Scanner input = new Scanner(System.in);
	
	// initialize variables

	double price, coupon, cash; // initialize input variables
	double subtotal, finaltotal, cashowed, amount, cashleft; // initialize calculation variables
	int onepence, twopence, fivepence, tenpence, twentypence, fiftypence, ones, fives, tens, twenties, fifties;
	
	// CONSTANT VARIABLES
	
		double ONEPENCE = .01;
    double TWOPENCE = .02;
		double FIVEPENCE = .05;
		double TENPENCE = .1;
		double TWENTYPENCE = .2;
    double FIFTYPENCE= .5;
		double ONES = 1;
		double FIVES = 5;
		double TENS = 10;
		double TWENTIES = 20;
    double FIFTIES =50;
		
		
	// processing phase
	// prompt cashier for input and read price from user
	System.out.print("Enter price or 0 to quit: ");
	price = input.nextDouble();
	
	// loop until sentinel value read from user
	while (price != 0)
	{
		total = total + price; // add item price to total
		itemcounter = itemcounter + 1;
		
		// prompt for input and read next price from cashier
		System.out.print("Enter price or 0 to quit: ");
		price = input.nextDouble();
	}
  k=0;
	do{
  if (purchasePrice== cash){
      System.out.println("No change given");
      break;
      }
  if (purchasePrice>cash){
      System.out.println("ERROR");
      break;
      }
  k+=1;
  }while(k<1);

		
		// Display item total, coupon total, subtotal, tax percentage, tax amount and total
		
		
		// Prompt cashier to enter cash given by customer
		System.out.print("\n" + "Enter amount of cash given: ");
		cash = input.nextDouble();
		
		// Tell cashier the amount to give back to customer
		cashowed = cash - finaltotal;
		System.out.printf("\n" + "CHANGE OWED: %.2f%n", cashowed);
		
		// Display amount of each bill to give back in change
    fifties=(int) Math.floor(cashowed/FIFTIES);
		twenties = (int) Math.floor(cashowed -fifties * FIFTIES /TWENTIES);
		tens = (int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES)/TENS);
		fives = (int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS)/FIVES);
		ones = (int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES));
    fiftypence=(int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES)*2);
    twentypence=(int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES
    -fiftypence*FIFTYPENCE )*5);
    tenpence= (int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES
                -fiftypence*FIFTYPENCE - twentypence*TWENTYPENCE )*10);
    fivepence=(int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES
                -fiftypence*FIFTYPENCE - twentypence*TWENTYPENCE - tenpence*TENPENCE  )*20);
    twopence=(int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES
                -fiftypence*FIFTYPENCE - twentypence*TWENTYPENCE - tenpence*TENPENCE - fivepence * FIVEPENCE )*20);
    onepence=(int) Math.floor((cashowed - fifties * FIFTIES  - twenties * TWENTIES - tens * TENS - fives * FIVES - ones * ONES
                -fiftypence*FIFTYPENCE - twentypence*TWENTYPENCE - tenpence*TENPENCE - fivepence * FIVEPENCE - twopence * TWOPENCE )*20);
 
		

		
		
	// Print correct change to give back	
  if (fifties > 0){
  for (i=0; i<fifties; i==){
		System.out.print("Fifty Pounds, ");
    }
	}
  
  if (twenties > 0){
  for (i=0; i<twentis; i==){
		System.out.print("Twenty pounds, ");
    }
	}
  
  if (tens > 0){
  for (i=0; i<tens; i==){
		System.out.print("Ten Pounds, ");
    }
	}
  if (fives > 0){
  for (i=0; i<fives; i==){
		System.out.print("Five Pounds, ");
    }
	}
	if (twos > 0){
  for (i=0; i<twos; i==){
		System.out.print("Two Pounds, ");
    }
	}
		
	if (ones > 0){
  for (i=0; i<ones; i==){
		System.out.print("One Pound, ");
    }
	}
		
	if (fiftypence > 0){
  for (i=0; i<fiftypence; i==){
		System.out.print("Fifty pence, ");
    }
	}
	
	if (twentypence > 0){
  for (i=0; i<tenpence; i==){
		System.out.print("Twenty pence, ");
    }
	}
	
	if (tenpence > 0){
  for (i=0; i<tenpence; i==){
		System.out.print("Ten pence, ");
    }
	}
		
	if (fivepence > 0){
  for (i=0; i<five pence; i==){
		System.out.print("Five pence, ");
    }
	}
		
	if (twopence > 0){
  for (i=0; i<twopence; i==){
		System.out.print("Two pence, ");
    }
	}
		
	if (pennies > 0){
  for (i=0; i<pennies; i==){
		System.out.print("One pence");
    }
	}
	
		System.out.println("----------------------");
		System.out.println("***END OF PROGRAM***");
		
	
	}
	
	}			
 
}	