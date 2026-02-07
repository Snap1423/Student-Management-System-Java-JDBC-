package dao;
import model.Student;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public void addStudent(Student student){
        String sql = "INSERT INTO students (name, email_id, course) VALUES(?,?,?)";

        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,student.getName());
            ps.setString(2,student.getEmail());
            ps.setString(3,student.getCourse());

            ps.executeUpdate();
            System.out.println("Student added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT*FROM students";

        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery()){
            while(st.next()){
                int id  = st.getInt("id");
                String name= st.getString("name");
                String email = st.getString("email_id");
                String course = st.getString("course");

                Student student = new Student(id,name,email,course);
                students.add(student);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return students;
    }

    public void updateStudent(Student student){
        String sql = "UPDATE students SET name = ?, email_id = ?, course =? WHERE id= ? ";
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3,student.getCourse());
            ps.setInt(4, student.getId());

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Updated Successfully");
            } else{
                System.out.println("No student found with this id ");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(Student student){
        String sql = "DELETE FROM students WHERE id =? ";
        try(Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1,student.getId());

            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Student Deleted Sucessfully");
            } else{
                System.out.println("No student found with this id ");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
