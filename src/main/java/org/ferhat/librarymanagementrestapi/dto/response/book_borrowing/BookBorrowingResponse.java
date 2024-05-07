package org.ferhat.librarymanagementrestapi.dto.response.book_borrowing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingResponse {
    private int id;
    private String name;
    private LocalDate borrowing_date;
    private LocalDate return_date;
}
