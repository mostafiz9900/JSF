package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "officer")
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "officer_name", unique = true, nullable = false)
    private String officerName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "pass_word", unique = true, nullable = false)
    private String passWord;
    @Column(name = "mobile", unique = true)
    private String mobile;
    @Column(name = "first_name", unique = true)
    private String firstName;
    @Column(name = "lase_name", unique = true)
    private String lastName;
    @Column(name = "reg_date")
    private Date regDate;
    @ManyToOne
            @JoinColumn(name = "desgi_id" , nullable = false)
    Designation designation;


}
