/**
 * Created by michaelwolfe on 1/30/17.
 */
public abstract class Pet {
    private String name;
    abstract String speak();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){return this.name;}
}
