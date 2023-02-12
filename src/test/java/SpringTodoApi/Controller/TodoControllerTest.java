package SpringTodoApi.Controller;

import SpringTodoApi.Entity.Task;
import SpringTodoApi.Repository.todoRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TodoControllerTest {

    @Autowired
    todoRepository testing;

    @Test
    void getAllTodos() {

    }

    @Test
    void createTodo() {
        Task task = new Task();
        task.setId(3L);
        task.setDescription("Makan nasi");
        testing.save(task);
        assertNotNull(testing.findById(3L).get());
    }

    @Test
    void deleteTodo() {
    }
}