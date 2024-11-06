public abstract class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void makeSound();
}
