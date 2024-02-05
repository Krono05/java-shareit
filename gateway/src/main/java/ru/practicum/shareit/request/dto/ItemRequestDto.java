package ru.practicum.shareit.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.util.CreateValidation;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDto {

    private Long id;
    @NotNull(message = "Описание запроса не может быть пустым", groups = CreateValidation.class)
    private String description;
    private LocalDateTime created;
    private List<ItemDto> items;
}
