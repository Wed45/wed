/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex;

/**
 *
 * @author Basmah yaqoob 
 */
import java.util.ArrayList;
import java.util.Collections;
public class Student extends User implements Comparable {
    private int grade;
    private ArrayList<course> StudentCourse;
    private ArrayList<Student> students;
    
    //defult Constructors

    public Student() {
        super();
        StudentCourse=new ArrayList<course>();
        students=new ArrayList<Student>();
    }
    // pramater  Constructor

    public Student(long ID, String name, String email, String password, int day, int month, int year ,int grade) {
        super(ID, name, email, password, day, month, year);
        this.grade = grade;
        this.StudentCourse = new ArrayList<course>();
        this.students =new ArrayList<Student>() ;
    }
    //setter and getter

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<course> getStudentCourse() {
        return StudentCourse;
    }

    public void setStudentCourse(ArrayList<course> StudentCourse) {
        this.StudentCourse = StudentCourse;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    //add qudrat 
    public void Addqudrat(Qudrat q){
    StudentCourse.add(q);
    }
     //add SAAT
      public void AddSAAT(SAAT s){
      StudentCourse.add(s);
      }
      // add students 
      public void Addstudent(Student st){
      students.add(st);
      }
      // Increase student grades
      public void grades( int g){
      this.grade= this.grade+ g;
      
      } 
    //delete courses
      public void deleteQudrat(Qudrat q) {
      if(StudentCourse.contains(q)){StudentCourse.remove(q);
       System.out.println("The course " +q+ " has been removed " );}
      else  System.out.println("The course" +q+ " does not exist " );
      }
        public void deleteSAAt(SAAT s) {
      if(StudentCourse.contains(s)){StudentCourse.remove(s);
       System.out.println("The course " +s+ " has been removed " );}
      else  System.out.println("The course" +s+ " does not exist " );
      }
      //delete student 
        public  void deletestudent( Student st){
            if(students.contains(st)){
            students.remove(st);
              System.out.println("The student " +st+ " has been removed " );
            }
            else System.out.println("The course" +st+ " does not exist " );
        }
        // search course qudrat
        public void searchQudrat(Qudrat q) {
        if (StudentCourse.contains(q)) {
            System.out.println("Course " + q + " found.");
        } else {
            System.out.println("Course " + q + " not found.");
        }
    }
         // search course  SAAT
        public void searchSAAT(SAAT s) {
        if (StudentCourse.contains(s)) {
            System.out.println("Course " + s + " found.");
        } else {
            System.out.println("Course " + s + " not found.");
        }
    }
         public void searchstudent(Student st) {
        if (students.contains(st)) {
            System.out.println("Course " + st+ " found.");
        } else {
            System.out.println("Course " + st + " not found.");
        }
    }
         // compareTo  for the student grade
    @Override 
    public int compareTo (Object obj){
   Student st=( Student)obj;
        if(this.grade<st.grade)
            return 1;
        else if(this.grade>st.grade)   
            return -1;
        else return 0;
    }
    // print 
     public String StudentCourseTostring(){
          Collections.sort(StudentCourse);
         String s= "Courses availalable for  student  " + this.getName() + ": \n";
         for(int i=0;i<this.getStudentCourse().size();i++)
             s=s+StudentCourse.get(i)+"\n";
         return s;
     }
      public String onestudenttoString(){
      String in=StudentCourseTostring();
      return super.toString()+"\n Grade:"+ this.grade+"\n"+in;
      

      }
      // to string
      
    @Override
    public String toString() {
        Collections.sort(students);
         String st = "Availalable student  Information: \n";
         for(int i=0;i<this.getStudents().size();i++)
         {st=st+students.get(i).toString()+"\n";}
         return st;
    }
    
      
}
