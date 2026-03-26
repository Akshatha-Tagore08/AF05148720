package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnection;
import model.Student;

public class StudentDAO {

    public void addStudent(Student student) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students(name) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());

            ps.executeUpdate();
            System.out.println("Student added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}