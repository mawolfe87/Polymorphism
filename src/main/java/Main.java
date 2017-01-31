import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by michaelwolfe on 1/30/17.
 */
public class Main {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args){
        Output output = new Output();

        System.out.println(output.promptForNumberOfPets());
        int numberOfPets = getNumberOfPets();
        Pet[] pets = new Pet[numberOfPets];
        for(int i = 0; i < pets.length - 1; i++){
            System.out.println(output.promptForTheKindOfPet());
            switch(getKindOfPet().toLowerCase()){
                case "dog":
                    pets[i] = new Dog();
                    break;
                case "cat":
                    pets[i] = new Cat();
                    break;
                case "bird":
                    pets[i] = new Bird();
                    break;
                default:
                    pets[i] = new Bird();
            }
            System.out.println(output.promptForNameOfPet());
            pets[i].setName(getNameOfPet());
        }

        for(int i = 0; i < numberOfPets; i++){
            System.out.println(getPetDetails());
        }
    }

    public static String getPetDetails() {
        return "I can't access the pets array it's a local variable of main and you don't pass it to me";
    }

    public static int getNumberOfPets(){
        return kb.nextInt();
    }

    public static String getKindOfPet(){
        kb.next();
        return kb.nextLine();
    }

    public static String getNameOfPet(){

        return kb.nextLine();
    }


}
