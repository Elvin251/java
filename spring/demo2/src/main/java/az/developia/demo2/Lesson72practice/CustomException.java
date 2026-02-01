package az.developia.demo2.Lesson72practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomException extends RuntimeException {

    private String error;
    private Integer status;

    public CustomException(String message, String error, Integer status) {
        super(message);
        this.error = error;
        this.status = status;
    }
}
