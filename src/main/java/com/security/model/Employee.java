package com.security.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="salary")
    private double salary;
    @Column(name="department_id")
    private int departmentId;
    @Column(name="email")
    private String email;


}
