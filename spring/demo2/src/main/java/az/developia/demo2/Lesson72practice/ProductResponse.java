package az.developia.demo2.Lesson72practice;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ProductResponse {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private LocalDate productYear;
    private String productLink;
}