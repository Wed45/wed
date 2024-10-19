package apex;

import java.util.ArrayList;

public class Qudrat extends course {

    private ArrayList<String> courses = new ArrayList<>();

    double PriceAfterDiscount = 0.0;
    private final double discountRates = .15;
    String s = "";

    /**
     * Constructor that adds default courses to the list (math and arabic).
     */
    public Qudrat() {
        courses.add(("math"));
        courses.add(("arabic"));
    }

    /**
     * Gets the list of courses.
     *
     * @return the list of courses.
     */
    public ArrayList<String> getCourses() {
        return courses;
    }

    /**
     * Sets the list of courses
     *
     * @param courses The new list of courses.
     */
    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    /**
     * Applies a discount to the course if the discount code is "KSA".
     * Otherwise, it prints that the code is invalid.
     *
     * @param code The discount code to apply.
     */
    public void codeDiscount(String code) {
        if (code.equals("KSA")) {
            PriceAfterDiscount = super.discount(discountRates);
        } else {
            System.out.println("The code is invalid or expired.");
        }
    }

    /**
     * Adds a new course to the list if the course is allowed. If the course
     * already exists, it prints a message.
     *
     * @param course The course to be added.
     */
    @Override
    public void addCourse(String course) {
        ArrayList<String> allowedCourses = new ArrayList<>();
        allowedCourses.add("math");
        allowedCourses.add("arabic");

        if (!allowedCourses.contains(course)) {
            System.out.println(" the course " + course + " is not allowed");
        }
        if (!courses.contains(course) && (course == " math" || course == "arabic")) {
            courses.add(course);
            System.out.println("the course " + course + " has been added ");

        } else if (courses.contains(course)) {
            System.out.println("the course " + course + " already exists");

        }

    }

    /**
     * Deletes a course from the list if it exists.
     *
     * @param course The course to be deleted.
     */
    @Override
    public void deleteCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("the course " + course + " has been removed ");

        }
    }

    /**
     * Searches for a course in the list. Prints whether the course was found or
     * not.
     *
     * @param courseName The name of the course to search for.
     */
    @Override
    public void searchCourse(String courseName) {

        if (courses.contains(courseName)) {
            System.out.println("Course " + courseName + " found.");
        } else {
            System.out.println("Course " + courseName + " not found.");

        }
    }

    /**
     * Returns a string representation of the Qudrat class. Includes the list of
     * courses and the price after discount (if applied)
     *
     * @return a string that describes the Qudrat object.
     */
    @Override
    public String toString() {
        System.out.println("the courses in the list are :");
        for (String course : courses) {
            s += course + " ";
        }

        if (PriceAfterDiscount != 0.0) {

            return "Qudrat \n" + super.toString() + " \nthe subjects are : " + s + " \nthe price of course after discount " + PriceAfterDiscount ;
        } else {
            return "Qudrat \n" + super.toString() + "  \nthe subjects are : " + s ;
        }

    }

}
