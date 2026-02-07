package main;

import dao.StudentDao;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDao dao = new StudentDao();

        while(true){
            System.out.println("\n==========Student Management System========");
            System.out.println("1. Add Student");
            System.out.println("2. View all Students");
            System.out.println("3. Update all Students");
            System.out.println("4. Delete all Students");
            System.out.println("5. Exit");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.print("Choose an Option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    Student newStudent = new Student(name,email,course);
                    dao.addStudent(newStudent);
                    break;

                case 2:
                    List<Student> students = dao.getAllStudent();
                    for(Student s: students){
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    int update_id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name to Update: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter Email to Update: ");
                    String newemail = sc.nextLine();

                    System.out.print("Enter Course to Update: ");
                    String newCourse = sc.nextLine();

                    Student updatedStudent = new Student(update_id,newName,newemail,newCourse);
                    dao.updateStudent(updatedStudent);
                    break;

                case 4:
                    System.out.print("Enter the Id to delete: ");
                    int deleted = sc.nextInt();
                    Student deleted_Id = new Student();
                    deleted_Id.setId(deleted);
                    dao.deleteStudent(deleted_Id);
                    break;

                case 5:
                    System.out.println("Exiting.....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice, try again!");
            }
        }
    }
}


