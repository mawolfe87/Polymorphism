/**
 * Created by michaelwolfe on 1/30/17.
 */
public class Main {


    public static void main(String[] args){
        int numberOfPets;
        Output output = new Output();
        Input input = new Input();
        output.promptForNumberOfMotherFuckingPets();
        numberOfPets = (input.howManyMotherFuckingPetsDoYouHave());
        getPetDetails(numberOfPets);
    }

    public static void getPetDetails(int number){

    }
}
