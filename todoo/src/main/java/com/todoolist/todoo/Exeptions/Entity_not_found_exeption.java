package com.todoolist.todoo.Exeptions;

public class Entity_not_found_exeption extends RuntimeException {
    Entity_not_found_exeption(Long id){
        super("could not find Object with that Id");
    }
}
