package org.ferhat.librarymanagementrestapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrow")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_book_id")
    private int id;

    @Column(name = "borrow_book_name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrow_date")
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_return_date")
    private LocalDate returnDate;

    /*
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_borrow_id", referencedColumnName = "book_id")
    private Book book;

     */

}
