package ru.practicum.user.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserShortDto {
    @NotNull
    private Long id;
    @NotBlank
    @Size(min = 2, max = 250)
    private String name;
}
