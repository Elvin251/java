package az.developia.demo2.Lesson51Homework.Task2;


import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentRestController {

    private List<StudentEntity> students = new ArrayList<>(List.of(
            new StudentEntity(1L, "Elvin", 20, 85.5),
            new StudentEntity(2L, "Aysel", 22, 92.0),
            new StudentEntity(3L, "Ramil", 21, 68.0)
    ));

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return students;
    }

    @GetMapping("/lowest-grade")
    public StudentEntity getLowestGradeStudent() {
        return students.stream()
                .min(Comparator.comparingDouble(StudentEntity::getGrade))
                .orElse(null);
    }

    @GetMapping("/search")
    public List<StudentEntity> searchByNameAndAge(@RequestParam String name, @RequestParam int age) {
        return students.stream()
                .filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()) && s.getAge() == age)
                .toList();
    }
}