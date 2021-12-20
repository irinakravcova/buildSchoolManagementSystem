package schoolSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Students {
    List<String> students = new ArrayList<>();
    //  HashMap<String, String> studentsExamResults = new HashMap<String, String>();
    //   HashMap<String, String> studentsCourses = new HashMap<String, String>();

    public List<String> examResults;
    //  String [][] studentsExamResults = {{students},{examResults}}

    public void add(String student) {
        students.add(student);
    }

    public Students() {
    }

    String[] allocateResult() {
        return new String[students.size()];
    }

    public String[] getAsArray() {
        return students.toArray(allocateResult());
    }

    public String removeStudent(int index) {
        if (index < 0 || index > students.size() - 1) {
            return null;
        }
        students.remove(index);
        return "OK";
    }

    public String edit(int index, String details) {
        if (index < 0 || index > students.size() - 1) {
            return "---";
        }
        students.remove(index);
        students.add(index, details);
        return "OK";
    }

    public String getStudent(int index) {
        if (index < 0 || index > students.size() - 1) {
            return "No such student";
        }
        return students.get(index);
    }


}
