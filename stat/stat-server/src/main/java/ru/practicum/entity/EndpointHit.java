package ru.practicum.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Builder
@Table(name = "endpoint_hits")
@Getter
public class EndpointHit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "app")
    private String app;
    @NotBlank
    @Column(name = "uri")
    private String uri;
    @NotBlank
    @Column(name = "ip")
    private String ip;
    @NotNull
    @Column(name = "timestamp")
    private LocalDateTime timestamp;
}
