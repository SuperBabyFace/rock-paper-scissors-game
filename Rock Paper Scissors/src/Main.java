import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Game game = new Game();
        char exit =' ' ;

        while (exit !='Q') {
            game.play();
            System.out.println("Press any key for PLAY AGAIN or 'Q' to exit");
            exit = scan.next().toUpperCase().charAt(0);
            //Able to exit the game with the key 'Q' or continue with any other key. 
        }
        scan.close();
        game.displaystate();
    }//Closes the main java and display the results of the rounds. 

}
//main java