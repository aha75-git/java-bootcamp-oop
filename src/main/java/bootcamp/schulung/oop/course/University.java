package bootcamp.schulung.oop.course;

import lombok.With;

import java.util.List;

@With
public record University(String id, String name, List<Course> courses) {
}
