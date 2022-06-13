package nguyen.webapp.springwebapp.bootstrap;

import nguyen.webapp.springwebapp.domain.Author;
import nguyen.webapp.springwebapp.domain.Book;
import nguyen.webapp.springwebapp.domain.Publisher;
import nguyen.webapp.springwebapp.repositories.AuthorRepository;
import nguyen.webapp.springwebapp.repositories.BookRepository;
import nguyen.webapp.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driver Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "395992926");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher publisher = new Publisher("Novels", "77 680 Roissy-en-Brie");
        publisherRepository.save(publisher);

        System.out.println("Started in bootstrap.");
        System.out.println("Number of books :  " + bookRepository.count());
        System.out.println("Number of publishers :  " + publisherRepository.count());
    }
}
