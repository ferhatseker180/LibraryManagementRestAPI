package org.ferhat.librarymanagementrestapi.dto.request.category;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorySaveRequest {

    @NotNull(message = "Category name can't be null!")
    private String name;
    private String description;
}
