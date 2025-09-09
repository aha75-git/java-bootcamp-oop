package bootcamp.schulung.oop.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String id, name, address;
    private double grade;
}
