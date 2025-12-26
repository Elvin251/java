package az.developia.demo2.Lesson64;

@Data
public class CustomerRequestDto {
    private String name;
    private String surname;
    private LocalDate birthday;
    private UserRequestDto user;
}
