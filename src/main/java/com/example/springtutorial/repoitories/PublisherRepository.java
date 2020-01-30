package com.example.springtutorial.repoitories;

import com.example.springtutorial.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
