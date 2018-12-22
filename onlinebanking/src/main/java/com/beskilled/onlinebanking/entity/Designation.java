package com.beskilled.onlinebanking.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    @Column(name = "desig_name")
private String designationName;
    @ManyToOne
    @JoinColumn(name = "officer_id" , nullable = false)
    private Officer officer;
}
