package rpg;

public class Fighter {

    private String name;
    private int hitPoints;
    private int maxDamage;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void printStats(){

        System.out.printf("%s has %d ");
    }

    public Fighter () {

    }
        public Fighter(String name, int  hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints= hitPoints;
        this.maxDamage = maxDamage;

        }
}
