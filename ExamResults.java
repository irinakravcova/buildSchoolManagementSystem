package schoolSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExamResults {
    List<String> examResults = new ArrayList<>();
    HashMap<String, String> studentsExamResults = new HashMap<String, String>();

    public String add (String student, String examResult){
        // studentsExamResults.put(student, examResult);
        return "Student and exam result are not implemented yet";
    }

    //  public void add(String examResult) {
    //     examResults.add(examResult);
    // }

    public ExamResults() {
    }

    String[] allocateResult() {
        return new String[examResults.size()];
    }

    public String[] getAsArray() {
        return examResults.toArray(allocateResult());
    }

    /*    public String removeexamResult(int index) {
            if (index < 0 || index > examResults.size() - 1) {
                return "No such exam result";
            }
            examResults.remove(index);
            return "OK";
        }
    */
    public String update(int index, String details) {
        if (index < 0 || index > examResults.size() - 1) {
            return "No such exam result";
        }
        examResults.remove(index);
        examResults.add(index, details);
        return "OK";
    }

    public String getexamResults(int index) {
        if (index < 0 || index > examResults.size() - 1) {
            return "No such exam result";
        }
        return examResults.get(index);
    }
}
