package PraticeDog;

public class PetDog extends Pet implements Companion {
    public PetDog(String name, String type, boolean isTrained) {
        super(name, type, isTrained);
    }
    private boolean trained;
    public String snuggle () {
        return getName() + " wants to snuggle!";
    }
    public boolean isTrained() {
        return trained;
    }
    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public PetDog(String name, String type, boolean isTrained, boolean trained) {
        super(name, type, isTrained);
        this.trained = trained;
    }
}