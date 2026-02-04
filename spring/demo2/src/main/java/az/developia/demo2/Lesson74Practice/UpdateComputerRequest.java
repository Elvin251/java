package az.developia.demo2.Lesson74Practice;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UpdateComputerRequest {

    @NotNull(message = "Id boş ola bilməz")
    private Long id;

    @NotBlank(message = "Brand boş ola bilməz")
    private String brand;

    @NotBlank(message = "Model boş ola bilməz")
    private String model;

    @NotNull(message = "Price boş ola bilməz")
    private Double price;

    @NotBlank(message = "Color boş ola bilməz")
    private String color;
}