package com.todoolist.todoo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
@EqualsAndHashCode
public class To_do_task {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long t_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String descreiption;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = To_do_List.class)
    private To_do_List toDoList;

    public To_do_task(String title, String descreiption, To_do_List toDoList) {
        this.title = title;
        this.descreiption = descreiption;
        this.toDoList = toDoList;
    }

    public Long getT_id() {
        return t_id;
    }

    public void setT_id(Long t_id) {
        this.t_id = t_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescreiption() {
        return descreiption;
    }

    public void setDescreiption(String descreiption) {
        this.descreiption = descreiption;
    }

    public To_do_List getToDoList() {
        return toDoList;
    }

    public void setToDoList(To_do_List toDoList) {
        this.toDoList = toDoList;
    }
}


