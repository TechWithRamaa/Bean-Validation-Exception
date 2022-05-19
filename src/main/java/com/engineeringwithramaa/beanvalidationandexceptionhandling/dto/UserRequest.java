package com.engineeringwithramaa.beanvalidationandexceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {
    @NotNull(message = "Name cannot be null")
    private String name;
    @Email(message = "Email cannot be null")
    private String mail;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile number entered")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(50)
    private int age;
    @NotBlank(message = "Please enter Nationality")
    private String nationality;
}
