package rikkei.academy;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rikkei Academy");
        student.setClasses("JV10");
        System.out.println(student);
        //Thay đổi các access modifier trong class Student để test lại kết quả
    }
}
