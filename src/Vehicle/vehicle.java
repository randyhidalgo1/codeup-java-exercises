package Vehicle;

public class vehicle {

    private String name;
    private String makeNoise;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMakeNoise() {
        return makeNoise;
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;

    }
    public void makeNoise(){
        System.out.println("Put, put, put, put");
    }
    public vehicle() {
    }
    public vehicle(String name) {
        this.name = name;
    }

}




