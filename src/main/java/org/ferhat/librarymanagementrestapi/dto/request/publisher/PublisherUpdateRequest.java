package org.ferhat.librarymanagementrestapi.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {

    @Positive
    private int id;
    @NotNull(message = "Publisher name musn't be null!")
    private String name;
    private LocalDate establishmentYear;
    private String address;

}
