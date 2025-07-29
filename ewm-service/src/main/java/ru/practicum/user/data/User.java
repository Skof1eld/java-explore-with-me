package ru.practicum.user.data;

import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Email
    @NotNull
    @Column(name = "email")
    @Size(min = 6, max = 254)
    private String email;
    @NotBlank
    @Column(name = "name")
    @Size(min = 2, max = 250)
    private String name;
}
