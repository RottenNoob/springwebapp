package nguyen.webapp.springwebapp.repositories;

import nguyen.webapp.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
