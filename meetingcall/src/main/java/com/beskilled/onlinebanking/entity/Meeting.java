package com.beskilled.onlinebanking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date startDate;
    private String to;
    private String form;
    private String subject;
    private String body;
    private String end;

    @ManyToOne
    @JoinColumn(name = "officer_id" , nullable = false)
    private Officer officer;

}
