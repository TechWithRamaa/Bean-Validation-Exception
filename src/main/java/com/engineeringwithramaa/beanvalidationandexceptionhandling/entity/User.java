package com.engineeringwithramaa.beanvalidationandexceptionhandling.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Entity
@Table(name = "USERS_TBL")
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String mail;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
