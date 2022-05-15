package com.engineeringwithramaa.beanvalidationandexceptionhandling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")

public class UserRequest {

    private String name;
    private String mail;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
