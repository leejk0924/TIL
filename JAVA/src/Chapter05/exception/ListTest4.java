package Chapter05.exception;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("STD-000001", "김둘리", 83, "컴퓨터 공학"));
        studentList.add(new Student("STD-000002", "박또치", 100, "컴퓨터 공학"));
        studentList.add(new Student("STD-000003", "도우너", 75, "기계 공학"));
        studentList.add(new Student("STD-000004", "고길동", 34, "기계 공학"));
        studentList.add(new Student("STD-000005", "정둘리", 77, "기계 공학"));
        studentList.add(new Student("STD-000006", "강또치", 23, "기계 공학"));
        studentList.add(new Student("STD-000007", "이망치", 100, "컴퓨터 공학"));

        int totalScore = 0;
        for (int i = 0; i < studentList.size(); i++) {
            totalScore += studentList.get(i).getScore();
        }
        int average = (totalScore/ studentList.size());


        System.out.println("평균 점수는 : " + average);
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getScore() > average) {
                System.out.println(studentList.get(i).toString());
            }

        }
    }

}
