/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package apex;

/**
 *
 * @author mashael shaker
 */
public abstract class course implements discountInterface {

    /**
     * ranksOfCourses It is given automatically when creating an object.
     *
     * @param percentage take the price of course before discount
     * @return price of course after discount
     */
    private int ranksOfCourses = 0;
    final double price = 550;

    public course() {
        this.ranksOfCourses = ranksOfCourses + 1;
    }

    public void setRanksOfCourses(int ranksOfCourses) {
        this.ranksOfCourses = ranksOfCourses;
    }

    /**
     *
     * @return ranksOfCourses
     */
    public int getRanksOfCourses() {
        return ranksOfCourses;
    }

    public abstract void addCourse(String course);

    public abstract void deleteCourse(String course);

    public abstract void searchCourse(String coursename);

    @Override
    public double discount(double percentage) {

        return (price - (percentage * price));
    }

    @Override
    public String toString() {
        return "The rank of Courses= " + getRanksOfCourses() + "\n the price of course before discount =" + price + '}';
    }

    /**
     *
     * @param obj
     * @return Boolean if ranksOfCourses for different class is equals
     */
    @Override
    public boolean equals(Object obj) {

        course other = (course) obj;
        return this.ranksOfCourses == other.ranksOfCourses;
    }

}

