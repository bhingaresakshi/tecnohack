import java.util.Random;
import java.util.*;
public class game
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

Random random= new Random();

String[] choices = {"rock", "paper", "scissors"};

while (true) {

int computerChoiceIndex=random.nextInt(3);

String computerChoice=choices[computerChoiceIndex];

System.out.print("Rock, Paper, or Scissors? Enter your choice: ");

String userChoice=sc.next().toLowerCase();
if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))){
System.out.println("Invalid input. Please choose 'rock', 'paper', or 'scissors'.");
continue;
}
System.out.println("Computer choice: " + computerChoice);
if (userChoice.equals(computerChoice)) {

System.out.println("It's a tie!");

} else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("scissors") && computerChoice.equals("paper")) || (userChoice.equals("paper") && computerChoice.equals("rock"))){

System.out.println("You win!");
} else {

System.out.println("Computer wins!");
}
System.out.print("Do you want to play again? (yes/no): ");

String playAgain = sc.next().toLowerCase();

if (!playAgain.equals("yes")){
break;
}
}
sc.close();
}
}