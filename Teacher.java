/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wed
 */
public class Teacher extends User implements Comparable{
    private int Experience;
    private ArrayList<String> certificates;
    private ArrayList<course> TeacherCourses;
    private ArrayList<Teacher> Teachers;
    // Constructors
    public Teacher(){
        super();
        certificates = new ArrayList<String>();
        TeacherCourses = new ArrayList<course>();
        Teachers = new ArrayList<Teacher>();
    }
    public Teacher(long ID,String name,String email, String password, int day,int month, int year, int Experience){
        super(ID, name, email, password, day, month, year);
        this.Experience = Experience;
        certificates = new ArrayList<String>();
        TeacherCourses = new ArrayList<course>();
        Teachers = new ArrayList<Teacher>();
    }
    //setter and getter
    public int getExperience() {
        return Experience;
    }
    public void setExperience(int Experience) {
        this.Experience = Experience;
    }
    public ArrayList<course> getTeacherCourses(){
        return TeacherCourses;
    }
    public ArrayList<String> getCertificates(){
        return certificates;
    }
    public ArrayList<Teacher> getTeachers(){
        return Teachers;
    }
    //add
    public void addQudrat(Qudrat q){
        TeacherCourses.add(q);
    }
    public void addSAAT(SAAT s){
        TeacherCourses.add(s);
    }
    public void addCertificate(String c){
        certificates.add(c);
    }
    public void addTeacher(Teacher t){
        Teachers.add(t);
    }
    //Increase teacher experience
    public void IncreaseExperience(int e){
        this.Experience = this.Experience + e;
    }
    //delete
    public void deleteQudrat(Qudrat q) {
        if (TeacherCourses.contains(q)) {
            TeacherCourses.remove(q);
            System.out.println("The course " +q+ " has been removed " );
        } else {
            System.out.println("The course" +q+ " does not exist " );
        }
    }
    public void deleteSAAT(SAAT s) {
        if (TeacherCourses.contains(s)) {
            TeacherCourses.remove(s);
            System.out.println("The course " +s+ " has been removed " );
        } else {
            System.out.println("The course" +s+ " does not exist " );
        }
    }
    public void deleteCertificate(String c) {
        if (certificates.contains(c)) {
            certificates.remove(c);
            System.out.println("The course " +c+ " has been removed " );
        } else {
            System.out.println("The course" +c+ " does not exist " );
        }
    }
    public void deleteTeacher(Teacher t) {
        if (Teachers.contains(t)) {
            Teachers.remove(t);
            System.out.println("The course " +t+ " has been removed " );
        } else {
            System.out.println("The course" +t+ " does not exist " );
        }
    }
    //search
    public void searchQudrat(Qudrat q) {
        if (TeacherCourses.contains(q)) {
            System.out.println("Course " + q + " found.");
        } else {
            System.out.println("Course " + q + " not found.");
        }
    }
    public void searchSAAT(SAAT s) {
        if (TeacherCourses.contains(s)) {
            System.out.println("Course " + s + " found.");
        } else {
            System.out.println("Course " + s + " not found.");
        }
    }
    public void searchCertificate(String c) {
        if (certificates.contains(c)) {
            System.out.println("Course " + c + " found.");
        } else {
            System.out.println("Course " + c + " not found.");
        }
    }
    public void searchTeacher(Teacher t) {
        if (Teachers.contains(t)) {
            System.out.println("Course " + t + " found.");
        } else {
            System.out.println("Course " + t + " not found.");
        }
    }
    //compareTo
    @Override
    public int compareTo (Object obj){
        Teacher t =(Teacher) obj;
        if (this.Experience < t.Experience)
            return 1;
        else if (this.Experience > t.Experience)
            return -1;
        else
            return 0;
    }
    //String
    public String TeacherCoursesToString(){
        Collections.sort(TeacherCourses);
        String e = "Courses availalable by Teacher " + this.getName() + ": \n";
        for(int i = 0; i<this.getTeacherCourses().size(); i++){
            e= e + TeacherCourses.get(i).toString()+"\n";
        }
        return e;
    }
    public String CertificatesToString(){
        Collections.sort(certificates);
        String e = "Certificates held by Teacher" + this.getName() + ": \n";
        for(int i = 0; i<this.getCertificates().size(); i++){
            e= e + certificates.get(i)+"\n";
        }
        return e;
    }
     public String oneTeacertoString(){
        String a = TeacherCoursesToString();
        String b = CertificatesToString();
        String e = a+"\n"+b;
        return super.toString()+"\n Experience: "+Experience+"\n"+e;
    }
    //toString
    @Override
    public String toString(){
        Collections.sort(Teachers);
        String e = "Availalable Teachers Information: \n";
        for(int i = 0; i<this.getTeachers().size(); i++){
            e= e + Teachers.get(i).toString()+"\n";
        }
        return e;
    }
}