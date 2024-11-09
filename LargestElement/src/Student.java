import java.util.Comparator;

public class Student {
    int rollNo;
    String name, address;
    Student(int rollNo, String name, String address)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return  this.rollNo +" "+ this.name + " "+ this.address;
    }
}