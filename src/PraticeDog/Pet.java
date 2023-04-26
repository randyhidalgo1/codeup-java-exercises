package PraticeDog;

public class Pet {
    private static String name;
    private String type;

    public Pet(String name, String type) {
        Pet.name = name;
        this.type = type;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        Pet.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
