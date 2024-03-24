import java.util.ArrayList;

/* Teachers should be able to manage courses, score students,
 and access valuable information to enhance their teaching experience on the platform.*/
public class Teacher {
    private ArrayList<Course> _courses = new ArrayList<>();

    // TODO: Sign Up: Teachers can sign up by following these steps:
    //          Request an account by contacting the assistant.
    //          Upon receiving access, provide necessary information to complete the sign-up process.

    // Take Courses: Teachers can explore and enroll in courses they wish to teach, displayed on their dashboard.
    public void TakeCourse(Course pCourse) {
        _courses.add(pCourse);
        pCourse.set_teacher(this);
    }

    // TODO: Score Students: Teachers can evaluate students by navigating to the scoring section on their dashboard,
    // selecting the appropriate course, and entering scores for each student.

    // View Courses List: Access a comprehensive list of courses they teach for an overview of current teaching assignments.
    public ArrayList<Course> getCourses() {
        return _courses;
    }

    // TODO: View Course's List of Students: Check the list of students enrolled in specific courses to monitor their progress.
    public void viewStudentsOf(Course pCourse) {
        for (Student s : pCourse.getEnrolledStudents()) {
            System.out.println(s.get_studentID().toString() + " " + s.studentFullName);
        }
    }


    // TODO: Show Teacher’s Score on the Menu: Conveniently monitor their teaching performance by checking their score displayed on the menu.



}
