package com.example.bootcamphibernate.tasklist.dao;


import com.example.bootcamphibernate.task.Task;
import com.example.bootcamphibernate.task.TaskFinancialDetails;
import com.example.bootcamphibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        int id = byListName.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(NAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //when
        taskListDao.save(taskList);
        int id = taskList.getId();

        //then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
