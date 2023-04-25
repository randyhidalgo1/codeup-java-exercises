package PraticeDog;
import java.util.ArrayList;
public class PetDogTest {

    public PetDogTest(String getName, String getType, boolean isTrained, boolean trained) {
    }

    public static void allSnuggle(ArrayList<PetDogTest> dogs) {
        for (PetDogTest dog : dogs) {
            System.out.println(dog.getName() + " wants to snuggle!");
        }
    }

//    public static void main(String[] args) {
//        PetDog petDog = new PetDog("Roxy", "Rottweiler", true, true);
//        System.out.println(petDog.getName() + " is a good dog");
//        System.out.println(petDog.getType() + " are great dogs");
//        System.out.println(petDog.isTrained() + " she is trained");
//        System.out.println(petDog.snuggle());
//    }

    public PetDogTest() {
    }

    public static void main(String[] args) {
        ArrayList<PetDogTest>dogs = new ArrayList<>();
        dogs.add(new PetDogTest("Roxy", "Rottweiler", true, true));
        dogs.add(new PetDogTest("Texan", "Pitbull", true, true));
        dogs.add(new PetDogTest("Murphy", "German Shepherd", true, true));

        String petDog;
        petDog.allSnuggle(dogs);
    }

}



