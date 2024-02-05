package ru.practicum.shareit.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.shareit.util.CreateValidation;
import ru.practicum.shareit.util.UpdateValidation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NotBlank(message = "Имя пользователя не должно содержать пробелы или быть пустым", groups = CreateValidation.class)
    private String name;
    @NotBlank(message = "Email не должен содержать пробелы или быть пустым", groups = CreateValidation.class)
    @Email(message = "Неверный email. Убедитесь, что формат соответствует email",
            groups = {CreateValidation.class, UpdateValidation.class})
    private String email;
}

