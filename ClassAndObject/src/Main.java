//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.id);
        System.out.println(student.name);

        try {
            Class cls = Class.forName("GFG");
            // Creating object of main class
            // using instance method
            GFG gfg = (GFG) cls.newInstance();
            System.out.println(gfg.name);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        Demo demo = new Demo();
        try {
            Demo demo1 = (Demo)demo.clone();
            System.out.println(demo1.name);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}