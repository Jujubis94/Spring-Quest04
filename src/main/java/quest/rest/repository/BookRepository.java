package quest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quest.rest.entity.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingIgnoreCaseOrDescriptionContaining(String title, String description);
}
