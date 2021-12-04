import java.util.Scanner;
public class Person {


        protected String name;


        // constructors
        public Person(String initialName){
            name = initialName;
        }


        public Person(){

        }


        public void setName( String fullName) {
            name = fullName;
        }

        public String getName() {
            return name;
        }




        public void registerFor(Course course) { // method called into TestApp.java

        }

    // method called into TestApp.java
        public boolean isRegisteredInCourse(Course course) {
            return false;
        }

        public String toString() {
            return "Person class; Name: " + name;
        }
    }



