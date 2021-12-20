package schoolSystem;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


public class Teachers {
    List<String> teachers = new ArrayList<>();
    HashMap<String, String> teachersCourses = new HashMap<String, String>();


    public void add(String teacher) {
        teachers.add(teacher);
    }

    public Teachers() {
    }

    String[] allocateResult() {
        return new String[teachers.size()];
    }

    public String[] getAsArray() {
        return teachers.toArray(allocateResult());
    }

    public String removeTeacher(int index) {
        if (index < 0 || index > teachers.size() - 1) {
            return "No such Teacher";
        }
        teachers.remove(index);
        return "OK";
    }

    public String edit(int index, String details) {
        if (index < 0 || index > teachers.size() - 1) {
            return "No such Teacher";
        }
        teachers.remove(index);
        teachers.add(index, details);
        return "OK";
    }

    public String getTeacher(int index) {
        if (index < 0 || index > teachers.size() - 1) {
            return "No such Teacher";
        }
        return teachers.get(index);
    }
}