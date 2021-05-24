import java.util.Scanner;


public class User extends Weapons {
    Scanner scan;
    public User() {
        super();
        scan=new Scanner(System.in);
    }
    public CHOICES getchoices () {
        System.out.println("Welcome to Rock Paper Scissors" + "\nYou are against Jarvice. Pick your weapon!" + "\nR: Rock, P:Paper , S:Scissors");//display this prompt when the program is ran
        char playerchoice=scan.next().toUpperCase().charAt(0);
        switch (playerchoice) {
        case 'R':
            return CHOICES.Rock;
        case 'P':
             return CHOICES.Paper;
        case 'S':
            return CHOICES.Scissors;
        }
        
        
        System.out.println("INVALID WEAPON");//if the user does not select the given weapon, it will prompt this
        return (getchoices());
        }
}