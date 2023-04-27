package PraticeDog;
import java.util.ArrayList;
import java.util.List;

public class PetDogTest {

    private String name;

    public static void main(String[] args) {
        PetDog spot = new PetDog("Spot", "Golden Retriever", true);
        PetDog murphy = new PetDog("Murphy", "Golden Retriever", true);
        PetDog roxy = new PetDog("Roxy", "Golden Retriever", true);
        ArrayList<PetDog> dogs = new ArrayList<>(List.of(spot, murphy, roxy));
        PetDog.allSnuggle(dogs);

//        String snuggleResult = spot.snuggle();
//        System.out.println(snuggleResult);

//    public static void main(String[] args) {
//        ArrayList<PetDog> dogs = new ArrayList<>(4);
//        for (int i = 0; i < 4; i++) {
//            dogs.add(new PetDog("Spot", "Golden Retriever", true));
//            dogs.add(new PetDog("Murphy", "Shepard Retriever", true));
//            dogs.add(new PetDog("Roxy", "Rottweiler", true));
//            dogs.add(new PetDog("Texan", "Pit Bull", false));
//            PetDog.allSnuggle(dogs);
//        }
    }
}





