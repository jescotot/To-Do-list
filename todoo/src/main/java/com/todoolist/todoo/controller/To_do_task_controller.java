package com.todoolist.todoo.controller;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.entity.To_do_task;
import com.todoolist.todoo.repository.List_Repository;
import com.todoolist.todoo.repository.Task_repository;
import com.todoolist.todoo.service.Task_service;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.todoolist.todoo.entity.To_do_task;
import java.util.ArrayList;
import java.util.List;

@RestController
public class To_do_task_controller {

    @Autowired
    List_Repository list_repository;

    @Autowired
    Task_repository task_repository;
    @Autowired
     private final Task_service task_service;

    To_do_task_controller(Task_service task_service){
        this.task_service = task_service;
    }

    @RequestMapping(value = "")
    public ArrayList<To_do_task> getAllTasks(){
        return task_service.getall();
    }


}
