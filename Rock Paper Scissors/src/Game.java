public class Game extends Weapons {
    private User player;
    private Jarvice computer;
    private CHOICES userWeapon;
    private CHOICES jarviceWeapon;
    public RESULT result;
    private static int vicotry;
    private static int defeat;
    private static int tie;


    public Game() {
        super();//superclass
        player = new User();
        computer = new Jarvice();
    }

    private void state() {
        if (result==RESULT.VICTORY) {
            vicotry++; //increment of 1 victory to user
        }
        
        else if (result==RESULT.DEFEAT) {
            defeat++; //increment of 1 defeat to user
        }
        
        else
            tie++; //increment of 1 tie to user
    }


    private void displayresults() { //display the results once the user and computer have input their choices.
        switch (result)
        {
            case VICTORY:
            	System.out.println("____________________________________________");
                System.out.println(userWeapon + " beats "
                		+ "" + jarviceWeapon + " \nYOU WIN!");
                break;
                //if the user wins it will display case VICTORY.
            case DEFEAT:
            	System.out.println("____________________________________________");
                System.out.println(userWeapon + " lose to " + jarviceWeapon + " \nYOU LOST!");
                break;
                //if the user loses it will display case DEFEAT
            case TIE:
            	System.out.println("____________________________________________");
                System.out.println(userWeapon + " equal to " + jarviceWeapon + " \nYOU TIED!");
                break;
                //if the user and computer chooses the same weapon, it will display case TIE.
        }
    }

    public void play() {
    	userWeapon=player.getchoices();
    	jarviceWeapon=computer.getchoice();
        result=getResult();
        displayresults();
        state();
    }
    public void displaystate() {
    	System.out.println("____________________________________________");
        System.out.println("-- You played " + (vicotry+tie+defeat) );
        System.out.println("-- You won " + vicotry + " times");
        System.out.println("-- You lost " + defeat + " times");
        System.out.println("-- You tied " + tie+" times");
        System.out.println("____________________________________________");
        System.out.println("Thank you for playing!");
//display end of game results.
    }

    private RESULT getResult() {
        if (jarviceWeapon==userWeapon) {
            return RESULT.TIE;
        }

        switch (userWeapon) {
        // Determine whether the computer loses or wins.
            case Rock:
                return (jarviceWeapon == CHOICES.Scissors ? RESULT.VICTORY :RESULT.DEFEAT);
            case Paper:
                return (jarviceWeapon == CHOICES.Rock ? RESULT.VICTORY :RESULT.DEFEAT);
            case Scissors:
                return (jarviceWeapon== CHOICES.Paper ? RESULT.VICTORY :RESULT.DEFEAT);
        }//conditional (right to left) base on user input.

        return RESULT.DEFEAT;
    }
}