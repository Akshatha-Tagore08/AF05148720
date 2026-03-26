package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnection;
import model.Course;

public class CourseDAO {

    public void addCourse(Course course) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO courses(course_name) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, course.getName());

            ps.executeUpdate();
            System.out.println("Course added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}