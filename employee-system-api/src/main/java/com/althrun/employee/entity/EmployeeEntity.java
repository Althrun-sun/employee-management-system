package com.althrun.employee.entity;

import jakarta.persistence.*;
import lombok.Data;
@Table(name = "employees")
@Data
@Entity
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
