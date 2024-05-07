package org.ferhat.librarymanagementrestapi.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherSaveRequest {

    @NotNull(message = "Publisher Name can't be null!")
    private String name;

    private LocalDate establishmentYear;
    private String address;
}
