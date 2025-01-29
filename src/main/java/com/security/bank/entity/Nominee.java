package com.security.bank.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Nominee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String relation;

    private String name;

    private Long accountNumber;

    private String gender;

    private int age;

}
