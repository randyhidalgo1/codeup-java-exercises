package PraticeDog;
import java.util.ArrayList;
public class PetDogTest {

    private String name;

    public static void main(String[] args) {
        PetDog myDog = new PetDog("Spot", "Golden Retriever", true);
        String snuggleResult = myDog.snuggle();
        System.out.println(snuggleResult);

//    public static void main(String[] args) {
        ArrayList<PetDog> dogs = new ArrayList<>();
        dogs.add(new PetDog("Murphy", "Shepard Retriever", true));
        dogs.add(new PetDog("Roxy", "Rottweiler", true));
        dogs.add(new PetDog("Texan", "Pit Bull", false));

        PetDog.allSnuggle(dogs);
    }
}





