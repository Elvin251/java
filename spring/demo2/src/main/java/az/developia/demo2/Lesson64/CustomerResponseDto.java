package az.developia.demo2.Lesson64;

@Data
public class CustomerResponseDto {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private UserResponseDto user;
}
