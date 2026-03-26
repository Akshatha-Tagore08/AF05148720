package main;

import java.util.Scanner;

import dao.StudentDAO;
import dao.CourseDAO;
import dao.RegistrationDAO;

import model.Student;
import model.Course;
import model.Registration;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        RegistrationDAO regDAO = new RegistrationDAO();

        while (true) {
            System.out.println("\n--- College Registration System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Student to Course");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String sname = sc.nextLine();
                    studentDAO.addStudent(new Student(sname));
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String cname = sc.nextLine();
                    courseDAO.addCourse(new Course(cname));
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Enter course ID: ");
                    int cid = sc.nextInt();

                    regDAO.registerStudent(new Registration(sid, cid));
                    break;

                case 4:
                    sc.close();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}