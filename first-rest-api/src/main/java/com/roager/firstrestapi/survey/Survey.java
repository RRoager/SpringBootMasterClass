package com.roager.firstrestapi.survey;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Survey {
    @NonNull
    private String id;
    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private List<Question> questions;
}
