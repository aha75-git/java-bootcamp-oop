package bootcamp.schulung.oop.course;

import bootcamp.schulung.oop.person.Student;
import bootcamp.schulung.oop.person.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Data
@Builder
@Value
public class Course {
    String id, name;
    Teacher teacher;
    List<Student> students;
}
