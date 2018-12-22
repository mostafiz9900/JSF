package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "mobile", unique = true)
    private String mobile;
    @Column(name = "first_name", unique = true)
    private String firstName;
    @Column(name = "lase_name", unique = true)
    private String lastName;
    @Column(name = "reg_date")
    private Date regDate;
    @ManyToOne
    @JoinColumn(name = "role_id" , nullable = false)
    private Role role;


}
