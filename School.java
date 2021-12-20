package schoolSystem;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class School<StudentExamResults> {
    public static void main(String[] args) {
        new School().doAll();

    }
    MyFrame myFrame = new MyFrame();
    Students students = new Students();
    Teachers teachers = new Teachers();
    Courses courses = new Courses();
    ExamResults examResults = new ExamResults();
    //   StudentExamResults studentsExamResults = new StudentExamResults();

    void doAll() {

        Scanner scanner = new Scanner(System.in);
        String userChoice = " ";
        do {

            //       JOptionPane.showMessageDialog ("School Management System. Select: ");
            System.out.println("School Management System. Select: " +
                    "\n" +"0. Exit"+
                    "\n" + "1. Student" +
                    "\n" + "2. Teacher" +
                    "\n" + "3. Course" +
                    "\n" + "4. ExamResults" +
                    "\n"+ "\n"+
                    "Enter your choice:");

            userChoice = scanner.nextLine();
            handleUserChoice(userChoice);
        } while (!userChoice.equals("0"));

    }

    private void handleUserChoice(String userChoice) {
        switch (userChoice) {
            case "0"://Exit the School Management System
                System.out.println("ending program. Good bye.");
                break;
            case "1": //Student - add, view, edit, delete
                Scanner scanner = new Scanner(System.in);
                String userChoice1 = " ";
                do {
                    System.out.println("Select the option:" +
                            "\n" +"0. Exit"+
                            "\n" + "1. Add a student" +
                            "\n" + "2. View students" +
                            "\n" + "3. Edit a student" +
                            "\n" + "4. Delete a student");


                    userChoice1 = scanner.nextLine().trim();
                    handleUserChoice1(userChoice1);
                } while (userChoice1.equals("0"));
                break;

            case "2"://Teacher- add, view, edit, delete
                Scanner scanner2 = new Scanner(System.in);
                String userChoice2 = " ";
                do {
                    System.out.println("Select the option:" +
                            "\n" +"0. Exit"+
                            "\n" + "1. Add a teacher" +
                            "\n" + "2. View teacher" +
                            "\n" + "3. Edit a teacher" +
                            "\n" + "4. Delete a teacher");

                    userChoice2 = scanner2.nextLine();
                    handleUserChoice2(userChoice2);
                } while (userChoice2.equals("0"));
                break;

            case "3"://Course- add, view, edit, delete
                Scanner scanner3 = new Scanner(System.in);
                String userChoice3 = " ";
                do {
                    System.out.println("Select the option:" +
                            "\n" +"0. Exit"+
                            "\n" + "1. Add a course" +
                            "\n" + "2. View course" +
                            "\n" + "3. Edit a course" +
                            "\n" + "4. Delete a course");

                    userChoice3 = scanner3.nextLine();
                    handleUserChoice3(userChoice3);
                } while (userChoice3.equals("0"));
                break;
            case "4"://Exam- enter, update, view details
                //
                Scanner scanner4 = new Scanner(System.in);
                String userChoice4 = " ";
                do {
                    System.out.println("Select the option:" +
                            "\n" +"0. Exit"+
                            "\n" + "1. Enter exam Result\"" +
                            "\n" + "2. Update exam Result" +
                            "\n" + "3. View exam Result");

                    userChoice4 = scanner4.nextLine();
                    handleUserChoice4(userChoice4);
                } while (userChoice4.equals("0"));
                break;
            default:
                System.out.println("please try again, option not implemented");
        }
    }

    //method for Exam Results
    private void handleUserChoice4(String userChoice4) {
        switch (userChoice4){
            case "0"://exit Exam results
                System.out.println("exit");
                break;
            case "1"://student and exam result
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Add a student and examResult (end putting with empty line): (prints only ExamResults) ");

                while (scanner.hasNextLine()) {
                    String student = scanner.nextLine();
                    String examResult = scanner.nextLine();
                    do {
                        //    studentsExamResults.put(student, examResult);
                        System.out.println("successfully added");
                    }while (student.isEmpty());
                    break;

//                    }
//
//                while (scanner.hasNextLine())
//                    if (examResult.isEmpty()) {
//                        break;
//                    }
                    // examResults.add(examResult);HashMap<String, String> studentsExamResults = new HashMap<String, String>()
                }
            }

            case "3": {//show student and examResults
                showExamResultsList();
            }
            break;

            case "2"://exam results edit;
            {
                System.out.println("Select a number of examResult you want to modify (-1 to cancel editing)?");

                showExamResultsList();
                Scanner scanner = new Scanner(System.in);
                int choiceExamResEdit = scanner.nextInt();
                if (choiceExamResEdit < 0) {
                    break;
                }
                scanner.nextLine(); //
                System.out.println("Current exam Result is: ");
                System.out.println(examResults.getexamResults(choiceExamResEdit-1));
                System.out.println("Enter examResult details (blank line to cancel editing)");
                String details = scanner.nextLine();
                if (details.isEmpty()) {
                    break;
                }
                String result = examResults.update(choiceExamResEdit - 1, details);
                if ("OK".equals(result)) {
                    System.out.println("result has been modified");
                } else {
                    System.err.println("Failed to edit");
                }
            }
            break;
            default:
                System.out.println("please try again, option not chosen for a course");
        }
    }

    //method for courses Exit, add, view, edit, delete
    private void handleUserChoice3(String userChoice3) {
        switch (userChoice3){
            case "0"://exit course
                System.out.println("exit");
                break;
            case "1"://course add
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Add a course(end with empty line): ");

                while (scanner.hasNextLine()) {
                    String course = scanner.nextLine();
                    if (course.isEmpty()) {
                        break;
                    }
                    courses.add(course);
                    System.out.println("course/s added");
                }
            }
            break;
            case "2": {//show course
                showCoursesList();
            }
            break;

            case "3"://course edit;
            {
                System.out.println("Select a number of a course you want to modify (-1 to cancel editing)?");

                showCoursesList();
                Scanner scanner = new Scanner(System.in);
                int choiceCourseEdit = scanner.nextInt();
                if (choiceCourseEdit < 0) {
                    break;
                }
                scanner.nextLine(); //
                System.out.println("Current course is: ");
                System.out.println(courses.getCourses(choiceCourseEdit-1));
                System.out.println("Enter courses details (blank line to cancel editing)");
                String details = scanner.nextLine();
                if (details.isEmpty()) {
                    break;
                }
                String result = courses.edit(choiceCourseEdit - 1, details);
                if ("OK".equals(result)) {
                    System.out.println("course has been modified");
                } else {
                    System.err.println("Failed to edit");
                }
            }
            break;
            case "4"://courses delete
            {
                System.out.println("Select the number of courses you want to remove?");
                showCoursesList();
                Scanner scanner = new Scanner(System.in);
                int choiceCourseDel = scanner.nextInt();
                if (choiceCourseDel < 0) {
                    break;
                }
                String result = courses.removeCourse(choiceCourseDel - 1);
                if ("OK".equals(result)) {
                    System.out.println("course was deleted");
                } else {
                    System.err.println("Failed to remove");
                }
            }
            break;
            default:
                System.out.println("please try again, option not chosen for a course");
        }}
    private void showCoursesList(){
        String[] elements = courses.getAsArray();
        int index = 1;
        for (String element : elements) {
            System.out.println(index + ": " + element);
            index++;
        }
    }

    //method for teachers Exit, add, view,edit, delete
    private void handleUserChoice2(String userChoice2) {
        switch (userChoice2) {
            case "0"://exit teacher
                System.out.println("exit");
                break;
            case "1"://teacher add
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Add a teacher (end with empty line): ");

                while (scanner.hasNextLine()) {
                    String teacher = scanner.nextLine();
                    if (teacher.isEmpty()) {
                        break;
                    }
                    teachers.add(teacher);
                    System.out.println("Teacher/s added");
                }
            }
            break;
            case "2": {//show teachers
                showTeachersList();
            }
            break;

            case "3"://teacher edit;
            {
                System.out.println("Select a number of a teacher you want to modify (-1 to cancel editing)?");

                showTeachersList();
                Scanner scanner = new Scanner(System.in);
                int choiceTeachEdit = scanner.nextInt();
                if (choiceTeachEdit < 0) {
                    break;
                }
                scanner.nextLine(); //
                System.out.println("Current teacher is: ");
                System.out.println(teachers.getTeacher(choiceTeachEdit-1));
                System.out.println("Enter teacher's details (blank line to cancel editing)");
                String details = scanner.nextLine();
                if (details.isEmpty()) {
                    break;
                }
                String result = teachers.edit(choiceTeachEdit - 1, details);
                if ("OK".equals(result)) {
                    System.out.println("Teacher has been modified");
                } else {
                    System.err.println("Failed to edit");
                }
            }
            break;
            case "4"://teacher delete
            {
                System.out.println("Select the number of teacher you want to remove?");
                showTeachersList();
                Scanner scanner = new Scanner(System.in);
                int choiceTeachDel = scanner.nextInt();
                if (choiceTeachDel < 0) {
                    break;
                }
                String result = teachers.removeTeacher(choiceTeachDel - 1);
                if ("OK".equals(result)) {
                    System.out.println("Teacher was deleted");
                } else {
                    System.err.println("Failed to remove");
                }
            }
            break;
            default:
                System.out.println("please try again, option not chosen for a teacher");
        }


    }

    private void showTeachersList() {
        String[] elements = teachers.getAsArray();
        int index = 1;
        for (String element : elements) {
            System.out.println(index + ": " + element);
            index++;
        }
    }

    //method only for student - Exit, add, view,edit, delete
    private void handleUserChoice1(String userChoice1) {
        switch (userChoice1) {
            case "0"://exit student
                System.out.println("exit");
                break;
            case "1"://student add
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Add a student (end with empty line): ");

                while (scanner.hasNextLine()) {
                    String student = scanner.nextLine();
                    if (student.isEmpty()) {
                        break;
                    }
                    students.add(student);
                    System.out.println("Student/s added");
                }
            }
            break;
            case "2": {//show students
                showStudentsList();
            }
            break;

            case "3"://student edit;
            {
                System.out.println("Select a number of student you want to modify (-1 to cancel editing)?");

                showStudentsList();
                Scanner scanner = new Scanner(System.in);
                int choiceStEdit = scanner.nextInt();
                if (choiceStEdit < 0) {
                    break;
                }
                scanner.nextLine(); //
                System.out.println("Current student is: ");
                System.out.println(students.getStudent(choiceStEdit-1));
                System.out.println("Enter student details (blank line to cancel editing)");
                String details = scanner.nextLine();
                if (details.isEmpty()) {
                    break;
                }
                String result = students.edit(choiceStEdit - 1, details);
                if ("OK".equals(result)) {
                    System.out.println("Student has been modified");
                } else {
                    System.err.println("Failed to edit");
                }
            }
            break;
            case "4"://student delete
            {
                System.out.println(
                        "Select a number of a student you want to remove? (-1 to cancel delete)");
                showStudentsList();
                Scanner scanner = new Scanner(System.in);
                int choiceStDel = scanner.nextInt();
                if (choiceStDel < 0) {
                    break;
                }
                String result = students.removeStudent(choiceStDel - 1);
                if ("OK".equals(result)) {
                    System.out.println("Student"+ students.removeStudent(choiceStDel - 1)  + "was deleted");
                } else {
                    System.err.println("Failed to remove the student");
                }
            }
            break;
            default:
                System.out.println("please try again, option not chosen for a student");
        }
    }

    private void showStudentsList() {
        String[] elements = students.getAsArray();
        int index = 1;
        for (String element : elements) {
            System.out.println(index + ": " + element);
            index++;
        }
    }


    private void showExamResultsList() {

        String [] elements = examResults.getAsArray();
        int index = 1;
        for (String element : elements) {
            System.out.println(" Exam result: " + element);
        }
    }
}
