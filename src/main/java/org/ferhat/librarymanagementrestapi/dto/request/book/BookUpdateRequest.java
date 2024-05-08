package org.ferhat.librarymanagementrestapi.dto.request.book;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.ferhat.librarymanagementrestapi.entity.BookBorrowing;
import org.ferhat.librarymanagementrestapi.entity.Category;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {

    @Positive(message = "Book id must be positive!")
    private Long id;
    @NotNull(message = "Book name can't be null!")
    private String name;

    private LocalDate publicationYear;
    private int stock;
    private Long authorId;
    private Long publisherId;
    private List<Category> categoryList;
}
