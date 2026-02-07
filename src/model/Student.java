package model;

public class Student {
    private int id;
    private String name;
    private String email_id;
    private String course;

    public Student(){}

    public Student(String name, String email_id, String course){
        this.name = name;
        this.email_id = email_id;
        this.course = course;
    }
    public Student(int id , String name, String email_id, String course){
        this.id = id;
        this.name = name;
        this.email_id = email_id;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email_id;
    }

    public void setEmail(String email) {
        this.email_id = email_id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String toString(){
        return "Student [id= " + id + ", name= " + name + ", email= " + email_id + ", course= "+ course + "]";
    }
}
