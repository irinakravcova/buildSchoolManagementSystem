package schoolSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Courses {
    List<String> courses = new ArrayList<>();
    HashMap<String, String> teachersCourses = new HashMap<String, String>();
    HashMap<String, String> studentsCourses = new HashMap<String, String>();



    public void add(String course) {
        courses.add(course);
    }

    public Courses() {
    }

    String[] allocateResult() {
        return new String[courses.size()];
    }

    public String[] getAsArray() {
        return courses.toArray(allocateResult());
    }

    public String removeCourse(int index) {
        if (index < 0 || index > courses.size() - 1) {
            return "No such course";
        }
        courses.remove(index);
        return "OK";
    }

    public String edit(int index, String details) {
        if (index < 0 || index > courses.size() - 1) {
            return "No such course";
        }
        courses.remove(index);
        courses.add(index, details);
        return "OK";
    }

    public String getCourses(int index) {
        if (index < 0 || index > courses.size() - 1) {
            return "No such course";
        }
        return courses.get(index);
    }


}