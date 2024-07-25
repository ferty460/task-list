package org.example.tasklist.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.tasklist.web.dto.validation.OnCreate;
import org.example.tasklist.web.dto.validation.OnUpdate;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull(message = "Id must not be null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must not be null", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must not be null", groups = OnCreate.class)
    private String passwordConfirmation;

}
