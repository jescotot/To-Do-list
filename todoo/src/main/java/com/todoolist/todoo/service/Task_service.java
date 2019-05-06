package com.todoolist.todoo.service;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.entity.To_do_task;
import com.todoolist.todoo.repository.List_Repository;
import com.todoolist.todoo.repository.Task_repository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class Task_service {

    @Autowired
    private Task_repository repo;

    ArrayList<To_do_task> task_list = new ArrayList<>();


    public ArrayList<To_do_task> getall() {
        repo.findAll().forEach(task_list::add);
        return task_list;
    }

    public void add_task(To_do_task task){
        repo.save(task);
    }


}