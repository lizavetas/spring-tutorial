package com.example.springtutorial.controller;

import com.example.springtutorial.repoitories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

  private BookRepository bookRepository;

  public BookController(final BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @RequestMapping("/books")
  public String getBooks(Model model) {
    model.addAttribute("books", bookRepository.findAll());

    return "books";
  }
}
