import java.util.Random;
public class Jarvice extends Weapons {
    Random rand;
    public Jarvice() {
        super();
        rand = new Random(); //the computer will select randomly from the enum CHOICES
    }


    public Weapons.CHOICES getchoice() {
        int choice = 1 + rand.nextInt(2);
        //will choose from the first case until the next 2 on a random order. 
        switch (choice) {
            case 1:
            return Weapons.CHOICES.Rock; // choose rock
            case 2:
            return Weapons.CHOICES.Paper; // choose paper
        }
        return Weapons.CHOICES.Scissors; //choose scissor
    }
}