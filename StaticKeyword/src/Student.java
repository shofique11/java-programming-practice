public class Student {
    String name;
    int rollNo;
    static String collegeName;
    static int countRoll = 0;
 public Student(String name){
     this.name = name;
     this.rollNo = setRollNo();
 }
   static int setRollNo() {
        countRoll++;
        return countRoll;
    }
    static  void setCollegeName(String name){
       collegeName = name;
    }
    public void displayDetail(){
        System.out.println("Name: "+ this.name);
        System.out.println("Roll No: "+ this.rollNo);
        System.out.println("College Name: "+ collegeName);
    }
}
