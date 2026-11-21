package com.app.cinepass.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;

    @Column(name = "age_rating", length = 20)
    private String ageRating;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(nullable = false, length = 30)
    @Builder.Default
    private String status = "NOW_SHOWING";
}