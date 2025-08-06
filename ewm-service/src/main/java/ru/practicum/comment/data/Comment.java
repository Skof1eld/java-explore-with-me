package ru.practicum.comment.data;

import lombok.*;
import ru.practicum.event.data.Event;
import ru.practicum.user.data.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 5, max = 5000)
    private String text;
    @NotNull
    private LocalDateTime created;
    private LocalDateTime editedOn;
    @NotNull
    @ManyToOne
    private User commentator;
    @NotNull
    @ManyToOne
    private Event event;
}
