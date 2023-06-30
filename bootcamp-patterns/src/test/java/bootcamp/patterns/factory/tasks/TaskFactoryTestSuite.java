package bootcamp.patterns.factory.tasks;

import bootcamp.patterns.factory.task.Task;
import bootcamp.patterns.factory.task.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactory() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);

        //then
        assertEquals("Painting task", painting.getTaskName());
        assertEquals("Driving task", driving.getTaskName());
        assertEquals("Shopping task", shopping.getTaskName());
    }
}
