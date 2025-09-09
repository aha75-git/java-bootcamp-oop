package bootcamp.schulung.oop.course;

import bootcamp.schulung.oop.person.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {

    public double averageGradeOfCourse(Course course) {
        /*
        double sum = 0.0;
        for(Student student : course.getStudents()) {
            sum += student.getGrade();
        }

        return sum / course.getStudents().size();

         */

        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public double averageGradeOfUniversity(University university) {
         /*  double sum = 0.0;
        for(Course course : university.courses()) {
            sum += this.averageGradeOfCourse(course);
        }
        return sum / university.courses().size();

       */

        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public List<Student> retrieveAllStudentsOfUniversityWithMinGradeOfGood(University university, double minimumGrade) {
        /* List<Student> students = new ArrayList<>();
        university.courses().forEach(course -> {
            students.addAll(course.getStudents().stream().filter(student -> student.getGrade() >= minimumGrade).toList());
        });
        return students;

         */

        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() >= minimumGrade)
                .toList();
    }
}
