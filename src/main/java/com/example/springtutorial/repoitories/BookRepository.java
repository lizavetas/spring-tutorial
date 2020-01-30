package com.example.springtutorial.repoitories;

import com.example.springtutorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
