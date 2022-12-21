package com.roager.firstrestapi.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class UserDetails {
    @Id
    @GeneratedValue
    private Long  id;
    @NonNull
    private String name;
    @NonNull
    private String role;
}
