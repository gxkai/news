package admin.operation;

import domain.User;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author guxukai
 */
@RequestMapping("/api/admin")
public interface UserOperation {
    @PutMapping("/users")
    ResponseEntity<User> updateUser(@RequestBody User user);

    @GetMapping("/users")
    ResponseEntity<Page<User>> getAllUsers(@RequestParam(name = "page", defaultValue = "1", required = false) Integer page, @RequestParam(name = "size", defaultValue = "15", required = false) Integer size);

    @GetMapping("/users/{id}")
    ResponseEntity<User> getUserById(@PathVariable("id") String id);

    @DeleteMapping("/users")
    ResponseEntity deleteUser(@PathVariable("id") String id);

    @PostMapping("/users")
    ResponseEntity<User> createUser(@RequestBody User user);
}
