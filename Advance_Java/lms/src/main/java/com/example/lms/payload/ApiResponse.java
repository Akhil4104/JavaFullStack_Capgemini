package com.example.lms.payload;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T>{
    private boolean success;
    private String message;
    private T data;
}
