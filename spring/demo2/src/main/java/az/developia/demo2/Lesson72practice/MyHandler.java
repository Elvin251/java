package az.developia.demo2.Lesson72practice;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyHandler {

    @ExceptionHandler(CustomException.class)
    public Map<String, Object> handleCustomException(CustomException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", ex.getMessage());
        map.put("error", ex.getError());
        map.put("status", ex.getStatus());
        return map;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handleValidationException(
            MethodArgumentNotValidException ex) {

        FieldError fieldError =
                ex.getBindingResult().getFieldErrors().get(0);

        Map<String, Object> map = new HashMap<>();
        map.put("message", fieldError.getDefaultMessage());
        map.put("error", "Validation Error");
        map.put("status", 400);
        return map;
    }
}