package nguyen.webapp.springwebapp.repositories;

import nguyen.webapp.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
