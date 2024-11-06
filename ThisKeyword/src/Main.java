//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mushiur Rahaman", 40);
//        person.setName("Shofique");
//        person.setAge(35);
        person.printDetails();

        Test test = new Test();
        Test test1 = new Test(40,50);
    }
}