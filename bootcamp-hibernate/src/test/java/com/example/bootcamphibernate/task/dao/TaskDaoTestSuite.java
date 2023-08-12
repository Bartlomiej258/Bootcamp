package com.example.bootcamphibernate.task.dao;

import com.example.bootcamphibernate.task.Task;
import com.example.bootcamphibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDao() {
        //given
        Task task = new Task(DESCRIPTION, 7);

        //when
        taskDao.save(task);

        //then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration() {
        //given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //when
        List<Task> readTask = taskDao.findByDuration(duration);

        //then
        assertEquals(1, readTask.size());

        //Cleanup
        int id = readTask.get(0).getId();
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //when
        taskDao.save(task);
        int id = task.getId();

        //then
        assertNotEquals(0, id);

        //CleanUp
        taskDao.deleteById(id);
    }
}
