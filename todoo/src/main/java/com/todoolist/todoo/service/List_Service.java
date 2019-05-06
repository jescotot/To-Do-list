package com.todoolist.todoo.service;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.repository.List_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class List_Service {
    @Autowired
    private List_Repository repo;

    List<To_do_List> list_group = new ArrayList<>();

    public List<To_do_List> display_tasks() {
        repo.findAll().forEach(list_group::add);
        return list_group;
    }

    public void add_list (To_do_List list){
        repo.save(list);
    }
}

