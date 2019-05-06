package com.todoolist.todoo.controller;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.service.List_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class To_do_list_controller {
    @Autowired
    private final List_Service list_service;

    To_do_list_controller(List_Service list_service){
        this.list_service = list_service;
    }

    @RequestMapping(value = "list")
    public List<To_do_List> show_lists(){
        return  list_service.display_tasks();
    }

    @RequestMapping( value = "list")
    public String index(Model model){
        model.addAttribute("Title","To-do-List");
        return "";
    }
}
