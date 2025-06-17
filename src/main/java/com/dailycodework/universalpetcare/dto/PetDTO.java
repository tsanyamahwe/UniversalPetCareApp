package com.dailycodework.universalpetcare.dto;

import lombok.Data;

@Data
public class PetDTO {
    private Long id;
    private String name;
    private String type;
    private String color;
    private String breed;
    private int age;
}
