import java.util.Vector;


public class Department {
    private String name; // the name of school “Dept of Computing and Info Science.”
    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
    Vector<Course> CL; // all courses offered by the department
    Vector<Student> registerList; // all students taking courses in the department.


    public Department(String name, String id) {

// initializes
        this.name = name;
        this.id = id;
        CL = new Vector<>();
        registerList = new Vector<>();
    }


    public String getName() {

        return name;
    }

    public String getId() {

        return id;
    }


    // adds course to CL
    public void offerCourse(Course course) {
        CL.add(course);
    }


    public void printCoursesOffered() {
        for (Course course : CL) {
            course.toString();// method that prints all the courses offered
        }
    }


    public void printStudentsByName() {
        for (Student student : registerList) {
            student.toString(); // method that prints all the students
        }
    }

    // method that checks if checking a given student is registered
    public boolean isStudentRegistered(Student student) {
        return registerList.contains(student);
    }

    // Using the course number, this function retrieves all the students who are enrolled in the specified course.
    public Vector<Student> studentsRegisteredInCourse(int number) {
        for (Course course : CL) {
            if (course.getNumber() == number)
                return course.classList;
        }
// If no students are registered, the value null is returned.
        System.out.println("No students are registered");
        return null;
    }

    //if no students are registered in a course, the course number is used to publish their names; otherwise, null is returned.
    public void printStudentsRegisteredInCourse(int number) {


// if there are no students registered in a course, a message indicating this will be printed
        if (studentsRegisteredInCourse(number).isEmpty()) {
            System.out.println("There are no students registered for this course");
            return;
        }

        for (Student student : studentsRegisteredInCourse(number)) {
            System.out.println(student.getId() + ", " + student.getName());
        }
    }


    public Course largestCourse() {  // returns the course with the most students


        int max = 0; //keeps track of the maximum number of students


// variable for storing the course with the most students
        Course largCourse = new Course();
        for (Course course : CL) {
            if (course.classList.size() > max) {

// for if the current course has more students than the maximum allowance
                max = course.classList.size();
                largCourse = course;
            }
        }
        return largCourse;
    }

    public String toString() {
// returns a string representation of department name, number
// of courses offered and number of students registered in the
// department. Use the format:
// ECSE: 53 courses, 460 students

        return id + ": " + String.valueOf(CL.size()) + " courses, " + String.valueOf(registerList.size()) + " students";
    }
}