package com.example.JavaCrudApis.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Getter
@Setter
@ToString
@Table(name = "workers")
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String role;
    private String fatherName;
    private Integer age;
//    private Object

public Workers (String role, String fatherName, Integer age ) {
    this.id = id;
    this.role = role;
    this.fatherName = fatherName;
    this.age = age;
}
}



