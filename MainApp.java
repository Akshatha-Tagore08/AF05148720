package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnection;
import model.Registration;

public class RegistrationDAO {

    public void registerStudent(Registration reg) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO registrations(student_id, course_id) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, reg.getStudentId());
            ps.setInt(2, reg.getCourseId());

            ps.executeUpdate();
            System.out.println("Registration successful!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}