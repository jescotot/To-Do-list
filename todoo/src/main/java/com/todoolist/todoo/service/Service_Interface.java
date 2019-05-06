package com.todoolist.todoo.service;


import com.todoolist.todoo.Exeptions.Entity_not_found_exeption;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.EntityNotFoundException;
import java.util.List;
public interface Service_Interface {
    AbstractEntity create(AbstractEntity entity) throws Entity_not_found_exeption;

    AbstractEntity update(AbstractEntity entity);

    boolean delete(long id) throws EntityNotFoundException;

    AbstractEntity findById(long id) throws EntityNotFoundException;

    List<AbstractEntity> readall();
}
