package SpringTodoApi.Controller;

import SpringTodoApi.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TodoController {
    @Autowired

    private final SpringTodoApi.Repository.todoRepository todoRepository;

    public TodoController(SpringTodoApi.Repository.todoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/taskList")
    public List<Task> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/add")
    public Task createTodo(@RequestBody Task todo) {
        return todoRepository.save(todo);
    }



    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }
}