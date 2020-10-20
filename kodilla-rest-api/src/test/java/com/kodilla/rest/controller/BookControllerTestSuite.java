package com.kodilla.rest.controller;

import org.junit.Test;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Modlitwa Żaby", "Anthony De Mello"));
        booksList.add(new BookDto("Spiew Ptaka", "Anthony De Mello"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        List<BookDto> result = bookController.getBooks();
        assertThat(result).hasSize(2);
    }
}