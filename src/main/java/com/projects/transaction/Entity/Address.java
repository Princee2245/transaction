package com.projects.transaction.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "EMPLOYEE_ADDRESS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;


}
