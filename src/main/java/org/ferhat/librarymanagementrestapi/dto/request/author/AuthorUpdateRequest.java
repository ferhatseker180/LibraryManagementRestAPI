package org.ferhat.librarymanagementrestapi.dto.request.author;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {

    @Positive(message = "ID must be positive number")
    private int id;

    @NotNull(message = "Author Name can't be null")
    private String name;

    private LocalDate birth_date;
    private String country;
}
