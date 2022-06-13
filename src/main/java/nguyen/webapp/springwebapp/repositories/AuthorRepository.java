package nguyen.webapp.springwebapp.repositories;

import nguyen.webapp.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
