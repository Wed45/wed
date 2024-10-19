package apex;

import java.util.Scanner;

public class Apex {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Qudrat Qudrat = new Qudrat ();
       SAAT SAAT = new SAAT ();
       Teacher Teachers = new Teacher();
       Student Students = new Student();
       int choice = 0;
       int ch;
       int user = 0;
       // Teacher Objects
       Teachers.addTeacher(new Teacher (101, "Emad","Emad@gmail.com","Emad12345",1,1,1990,12));
       Teachers.addTeacher(new Teacher(102, "Nora","Nora@gmail.com","Nora12345",1,1,1990,5));
       Teachers.addTeacher(new Teacher(103, "Nasser","Nasser@gmail.com","Nasser12345",1,1,1990,2));
       Teachers.addTeacher(new Teacher(104, "Retaj","Retaj@gmail.com","Retaj12345",1,1,1990,4));
       Teachers.addTeacher(new Teacher(105, "Ahmad","Ahmad@gmail.com","Ahmad12345",1,1,1990,7));
       // Student Objects
       Students.Addstudent(new Student (201, "Wed","Wed@gmail.com","Wed12345",1,1,2005,100));
       Students.Addstudent(new Student(202, "Mashael","Mashael@gmail.com","Mashael12345",1,1,2005,100));
       Students.Addstudent(new Student(203, "Amal","Amal@gmail.com","Amal12345",1,1,2005,100));
       Students.Addstudent(new Student(204, "Shaima","Shaima@gmail.com","Shaima12345",1,1,2004,100));
       Students.Addstudent(new Student(205, "Basmah","Basmah@gmail.com","Basmah12345",1,1,2004,100));
       Students.Addstudent(new Student(206, "Esraa","Esraa@gmail.com","Esraa12345",1,1,2005,100));
       // choices
       System.out.println("Wellcome in Apex!! \nSelect how to start: ");
       while(user != 3){
            System.out.println("Enter 1 for Teacher or 2 for Student or 3 to Exit");
            user = scanner.nextInt();
            // log in as Teacher
            if(user == 1){
                System.out.println("You loged in as Teacher \nchoice a number from 1-8 : \n");
                while(choice != 8){
                    System.out.println("1) choice 1");
                    System.out.println("2) choice 2");
                    System.out.println("3) choice 3");
                    System.out.println("4) choice 4");
                    System.out.println("5) choice 5");
                    System.out.println("6) choice 6");
                    System.out.println("7) choice 7");
                    System.out.println("8) Log out from Teacher");
                    choice = scanner.nextInt();
           
                    if (choice == 1){
                        //choice 1
                    }
           
                    if (choice == 2){
                        //choice 2
                    }

                    if (choice == 3){
                        //choice 3
                    }
           
                    if (choice == 4){
                        //choice 4
                    }
                    
                    if (choice == 5){
                        //choice 5
                    }
           
                    if (choice == 6){
                        //choice 6
                    }
                    
                    if (choice == 7){
                        //choice 7
                    }
                    
                    if (choice == 8){
                        break;
                    } 
                }           
            }
            // log in as Student
            else if(user == 2){
                System.out.println("You loged in as Student \nchoice a number from 1-8 : \n");
                while(choice != 8){
                    System.out.println("1) choice 1");
                    System.out.println("2) choice 2");
                    System.out.println("3) choice 3");
                    System.out.println("4) choice 4");
                    System.out.println("5) choice 5");
                    System.out.println("6) choice 6");
                    System.out.println("7) choice 7");
                    System.out.println("8) Log out from Student");
                    choice = scanner.nextInt();
           
                    if (choice == 1){
                        //choice 1
                    }
           
                    if (choice == 2){
                        //choice 2
                    }

                    if (choice == 3){
                        //choice 3
                    }
           
                    if (choice == 4){
                        //choice 4
                    }
                    
                    if (choice == 5){
                        //choice 5
                    }
           
                    if (choice == 6){
                        //choice 6
                    }
                    
                    if (choice == 7){
                        //choice 7
                    }
                    
                    if (choice == 8){
                        break;
                    } 
                }           
            }
            //Exit
            else if (user == 3){
                break;
            }
            //Wrong number
            else {
                System.out.println("Enter a Valid number");
            }
        }
    }
}
    
