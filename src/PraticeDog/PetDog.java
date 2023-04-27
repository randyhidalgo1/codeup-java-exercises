package PraticeDog;
import java.util.ArrayList;
import java.util.HashSet;

public class PetDog extends Pet implements Companion {
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }
    private boolean trained;
    public boolean isTrained() {
        return trained;
    }
    public String snuggle() {
        return getName() + " wants to snuggle!";
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public static void allSnuggle(ArrayList<PetDog> dogs) {
//        HashSet<String> names = new HashSet<>();
        for (PetDog dog : dogs) {
//            if (!names.contains(getName())) {
                System.out.println(dog.snuggle());
//                names.add(getName());
            }


        }
    }
