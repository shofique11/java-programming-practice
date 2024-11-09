import java.util.Comparator;

public class SortByroll implements Comparator<Student>{
    // Helper class extending Comparator interface
        // Used for sorting in ascending order of
        // roll number
        public int compare(Student a, Student b){
            return a.rollNo - b.rollNo;
        }
}
