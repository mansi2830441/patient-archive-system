package com.mansi.archive.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1, message = "Age must be greater than 0")
    private int age;

    public Patient() {}

    public Long getId() { return id; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}