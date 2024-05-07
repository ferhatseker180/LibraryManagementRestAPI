package org.ferhat.librarymanagementrestapi.dto.request.book_borrowing;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingUpdateRequest {

    @Positive(message = "Book Borrowing ID must be positive")
    private int id;

    @NotNull(message = "Book Borrowing Name can't be null!")
    private String name;

    private LocalDate return_date;
}
