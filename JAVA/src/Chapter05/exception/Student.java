package Chapter05.exception;

import java.util.Objects;

public class Student {
    private String studentNo;
    private String name;
    private int score;
    private String major;

    public Student(String studentNo, String name, int score, String major) {
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
        this.major = major;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(studentNo, student.studentNo) && Objects.equals(name, student.name) && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo, name, score, major);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", major='" + major + '\'' +
                '}';
    }
}
