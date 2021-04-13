package com.inteca.Inteca.model;

import lombok.Data;
import javax.persistence.*;


@Entity(name = "credit")
@Data
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private Long creditId;
    @Column(name = "credit_name")
    private String creditName;


}

