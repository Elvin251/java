package az.developia.demo2.Lesson72practice;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class AddProductRequest {

    @NotBlank(message = "Title bos ola bilmez")
    @Size(min = 5, max = 30, message = "Title 5-30 simvol araliginda olmalidir")
    private String title;

    @Size(max = 3000, message = "Description maksimum 3000 simvol ola biler")
    private String description;

    @NotNull(message = "Price bos ola bilmez")
    @DecimalMin(value = "10.0", message = "Price minimum 10 olmalidir")
    @DecimalMax(value = "50000.0", message = "Price maksimum 50000 ola biler")
    private BigDecimal price;

    @NotNull(message = "Year bos ola bilmez")
    @PastOrPresent(message = "Product ili gelecek ola bilmez")
    private LocalDate productYear;

    @URL(message = "Product link URL formatinda olmalidir")
    private String productLink;
}
