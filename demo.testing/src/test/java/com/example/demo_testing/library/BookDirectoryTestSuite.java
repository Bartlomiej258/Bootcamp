package com.example.demo_testing.library;

import com.example.testing.library.Book;
import com.example.testing.library.BookLibrary;
import com.example.testing.library.LibraryDatabase;
import com.example.testing.library.LibraryUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf0Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listWith0Books = new ArrayList<>();
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "453454");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith0Books);

        //When
        List<Book> books = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, books.size());
    }

    @Test
    void testListBooksInHandsOf1Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listWith1Book = new ArrayList<>();
        listWith1Book.add(new Book("New World", "Adam Knapik", 1998));
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "453454");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith1Book);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, result.size());
    }

    @Test
    void testListBooksInHandsOf5Books() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listWith5Book = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowalski", "453454");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith5Book);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, result.size());
    }



}
