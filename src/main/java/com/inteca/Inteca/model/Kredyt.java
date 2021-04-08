package com.inteca.Inteca.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;


@Entity(name = "credit")
@Data
public class Kredyt {
    @Id
    @Column(name = "credit_id")
    private Long creditId;
    @Column(name = "credit_name")
    private String creditName;


}

