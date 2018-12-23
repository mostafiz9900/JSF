package com.beskilled.onlinebanking.entity;

import javax.persistence.*;

@Entity
@Table(name = "minor")
public class Minor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String meetingTitle;
    private String agendaAction;
    private String remark;

    @ManyToMany
    @JoinColumn(name = "meeting_id", nullable = false)
    private Meeting meeting;

}
