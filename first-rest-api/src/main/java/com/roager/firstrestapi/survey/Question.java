package com.roager.firstrestapi.survey;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Question {
    @NonNull
    private String id;
    @NonNull
    private String description;
    @NonNull
    private List<String> options;
    @NonNull
    private String correctAnswer;
}
