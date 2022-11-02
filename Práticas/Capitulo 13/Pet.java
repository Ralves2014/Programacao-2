public class Pet {

    protected String name;
    protected String specie;

    public Pet(String name, String specie){
        this.name=name;
        this.specie=specie;
    }

    public String toString(){
        return specie + " " + name;
    }

    
}