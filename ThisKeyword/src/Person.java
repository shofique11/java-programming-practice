public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void printDetails()
    {
//        System.out.println("Name: "+ this.getName());
//        System.out.println("Age: "+ this.getAge());
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
    }
}
