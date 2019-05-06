package com.todoolist.todoo;

import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.entity.To_do_task;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodooApplicationTest {

    @Test
    public void main() {
        To_do_List listx = new To_do_List("side quests");
        assertEquals("side quests",listx.toString());
    }
}