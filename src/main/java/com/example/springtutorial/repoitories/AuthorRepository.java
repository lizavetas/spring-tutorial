package com.example.springtutorial.repoitories;

import com.example.springtutorial.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
