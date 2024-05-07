package org.ferhat.librarymanagementrestapi.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdateRequest {

    @Positive(message = "Category ID number must be positive!")
    private int id;
    @NotNull(message = "Category Name can't be null!")
    private String name;
    private String description;
}
