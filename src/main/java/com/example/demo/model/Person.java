package com.example.demo.model;

import com.example.demo.groups.GroupA;
import com.example.demo.groups.GroupB;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Person {
    @Min(groups = {GroupA.class}, value = 0, message = "El ID debe ser mayor a cero")
    @Max(groups = {GroupA.class, GroupB.class}, value = 9, message = "El ID debe ser menor a nueve")
    private Integer id;
    
    @NotBlank(groups = {GroupA.class}, message = "El nombre no puede ser nulo")
    private String name;
}
