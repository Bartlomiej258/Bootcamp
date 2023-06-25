package bootcamp.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library1 = new Library("Library1");
        Book book1 = new Book("New World", "Adam Molek", LocalDate.of(1988, 01,01));
        Book book2 = new Book("New Shop", "Victor Molek", LocalDate.of(1968, 03,04));
        Book book3 = new Book("New Angle", "Peter Mixer", LocalDate.of(1988, 11,05));

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        //making a shallow copy of library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library1.getBooks().remove(book1);

        //then
        System.out.println(library1);
        System.out.println(clonedLibrary);
        assertEquals(2, library1.books.size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.books.size());
    }
}
