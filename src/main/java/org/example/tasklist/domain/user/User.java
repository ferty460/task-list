package org.example.tasklist.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.tasklist.domain.task.Task;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;

    private Set<Role> roles;
    private List<Task> tasks;

}
