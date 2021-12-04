
import java.util.Vector;

public class Student extends Person{


    private String id; // initializes id as a private String
    private Vector<Course> courses; // contains all courses the student is registered in

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // constructor
    public Student(String id, String name) {

// initialize name, id and vector
        this.id = id;
        this.name = name;
        courses = new Vector<>();
    }

    // registers students for courses
    public void registerFor(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.classList.add(this);
            course.getDept().registerList.add(this);
        }
    }

    public boolean isRegisteredInCourse(Course course) {
        return courses.contains(course);
    }

    public String toString() {

// return a string representation of a student using the following format:
// 100234546 John McDonald
// Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        StringBuilder fff = new StringBuilder(id).append(" ").append(name).append("\nRegistered courses: ");

        for (Course course : courses) {
            fff.append(", ");
            fff.append(course.getCode()).append(" ").append(course.getTitle());
        }
        return fff.toString();
    }
}