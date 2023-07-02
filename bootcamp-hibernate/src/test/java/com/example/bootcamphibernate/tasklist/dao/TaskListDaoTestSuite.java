package com.example.bootcamphibernate.tasklist.dao;


import com.example.bootcamphibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static String DESCRIPTION = "Do shopping";
    private static String NAME = "To Do";

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.listName();

        //when
        List<TaskList> byListName = taskListDao.findByListName(listName);

        //then
        assertEquals(1, byListName.size());
        assertEquals("To Do", byListName.get(0).listName());

        //Cleanup
        int id = byListName.get(0).id();
        taskListDao.deleteById(id);
    }
}
