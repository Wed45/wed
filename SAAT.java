/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex;


/**
 *
 * @author AMAL AL-SHRIEF
 */



import java.util.ArrayList;

public class SAAT extends course {
    private ArrayList<String> courses;
    double PriceAfterDiscount=0.0;
    public final double discountRates = 0.25;

    
    // Constructor: initializes the list of courses and adds some default courses
    public SAAT() {
        courses = new ArrayList<>();
        courses.add("Biology");
        courses.add("Chemistry");
        courses.add("Physics");
        courses.add("Mathematic");
    }

     /**
     * Applies a discount to the price if the code is correct.
     * 
     * @param code Discount code (String)
     * 
     * If the code equals "KSA", the discount will be applied to the price.
     * If the code is incorrect, a message will indicate //.
     */
    
    public void codeDiscount(String code) {
        if (code.equals("KSA")) {
            PriceAfterDiscount = super.discount(discountRates);
        } else {
            System.out.println("The code is invalid or expired.");
        }
    }

    
     /**
     * Adds a course to the list if it is within the allowed courses.
     *
     * @param course The name of the course to be added.
     */

    public void addCourse(String course) { 
        ArrayList<String> allowedCourses = new ArrayList<>(); 
        allowedCourses.add("Biology"); 
        allowedCourses.add("Chemistry"); 
        allowedCourses.add("Physics"); 
        allowedCourses.add("Mathematic"); 

        if (!allowedCourses.contains(course)) { 
            System.out.println(" the course " + course + " is not allowed"); 
        } 
        if (!courses.contains(course) && (course == " Biology" || course == "Chemistry" ||course == "Physics"||course == "Mathematic")) { 
            courses.add(course); 
            System.out.println("the course " + course + " has been added "); 
 
        } else if ( courses.contains(course )) { 
            System.out.println("the course " + course + " already exists"); 
 
        } 
 
    }

      /**
     * Deletes a course from the list.
     * 
     * @param course Name of the course (String)
     * 
     * If the course exists, it is removed and a message indicates this.
     */
    
    @Override
    public void deleteCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("The course " +course+ " has been removed " );
        } else {
            System.out.println("The course" +course+ " does not exist " );
        }
    }

     /**
     * Searches for a course in the list.
     * 
     * @param courseName Name of the course to search for (String)
     * 
     * If the course is found, a message indicates it is present.
     * If not found, a message indicates its absence.
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
     * Converts the SAAT object to a string.
     * 
     * @return A string containing course information and its price after discount (String)
     * 
     * Displays course names and the price after applying the discount.
     */
    String s="";
    @Override   
    public String toString() {
        System.out.println("the courses in the list are :");        
        for (String course : courses) {
            s += course + " ";        }
        if (PriceAfterDiscount != 0.0) {
         return "SAAT \n" + super.toString() + " \nthe subjects are : " + s + " \nthe price of course after discount " + PriceAfterDiscount ;
        } else {            
         return "SAAT \n" + super.toString() + "  \nthe subjects are : " + s ;}
}
