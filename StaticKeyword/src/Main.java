//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Shofique");
        Student.setCollegeName("Dhaka college");
        student.displayDetail();
        Student student2 = new Student("Masfikur");
        Student.setCollegeName("City college");
        student2.displayDetail();

        GFG.MyNestedClass gfg = new GFG.MyNestedClass();
        gfg.display();
    }
}