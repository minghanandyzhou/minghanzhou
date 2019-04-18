import java.io.PrintStream;

public class RaffleWinners{
  public static void main(String[] args){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    java.util.Random generator = new java.util.Random();

    int minNumber, maxNumber, range;
		String Input;

    do{
       System.out.println("What is the smallest raffle number?");
       minNumber = Integer.parseInt(scan.nextLine());
       while (minNumber < 1){
         if(minNumber <= 0){
           System.out.println("The number should be positive and greater than 0.");
         }
         System.out.println("What is the smallest raffle number?");
         minNumber = Integer.parseInt(scan.nextLine());
         }

         System.out.println("What is the largest raffle number sold? ");
         maxNumber = Integer.parseInt(scan.nextLine());
         range = (maxNumber-minNumber);
         while(maxNumber < 1 || range < 3){
         if(maxNumber <=0){
           System.out.println("The number should be positive and greater than 0.");
         }
         else if(maxNumber <= minNumber){
					 System.out.println("The largest raffle number should be bigger than the smallest raffle number.");
				 }
         else {
					System.out.println("Three or more tickets should be sold");
         }
         System.out.println("What is the largestest raffle number sold? ");
			 	 maxNumber=Integer.parseInt(scan.nextLine());
				 range = (maxNumber - minNumber);
         }

         System.out.println("The winning raffle ticket numbers are: ");
         int winner1= generator.nextInt(maxNumber - minNumber + 1) + minNumber;
         int winner2 = generator.nextInt(maxNumber - minNumber + 1) + minNumber;
         while (winner2 == winner1) {
         winner2 = generator.nextInt(maxNumber - minNumber + 1) + minNumber;
         }
         int winner3 = generator.nextInt(maxNumber - minNumber + 1) + minNumber;
         while ((winner3 == winner1) || (winner3 == winner2)) {
         winner3 = generator.nextInt(maxNumber - minNumber + 1) + minNumber;
         }

         System.out.println("Winner 1: " + winner1);
         System.out.println("Winner 2: " + winner2);
         System.out.println("Winner 3: " + winner3);

         System.out.println("Do you want to play again? y/n" );
			   Input = scan.nextLine();

       }while (Input.equalsIgnoreCase("y"));
  }
}

/* Sample outputs
What is the smallest raffle number?
-1
The number should be positive and greater than 0.
What is the smallest raffle number?
1
What is the largest raffle number sold?
9
The winning raffle ticket numbers are:
Winner 1: 4
Winner 2: 8
Winner 3: 3
Do you want to play again? y/n
y
What is the smallest raffle number?
4
What is the largest raffle number sold?
4
The largest raffle number should be bigger than the smallest raffle number.
What is the largestest raffle number sold?
20
The winning raffle ticket numbers are:
Winner 1: 10
Winner 2: 7
Winner 3: 20
Do you want to play again? y/n
n
*/
