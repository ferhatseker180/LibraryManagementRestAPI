package org.ferhat.librarymanagementrestapi.dto.response.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherResponse {
    private int id;
    private String name;
    private LocalDate establishmentYear;
}
