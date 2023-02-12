package SpringTodoApi.Repository;

import SpringTodoApi.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository<Task, Long> {
}
