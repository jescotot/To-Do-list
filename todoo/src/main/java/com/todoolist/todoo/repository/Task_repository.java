package com.todoolist.todoo.repository;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.entity.To_do_task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface Task_repository extends JpaRepository<To_do_task,Long> {

}
