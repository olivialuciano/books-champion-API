package com.proyecto.Booking.service;

import com.proyecto.Booking.persistence.entities.Book;
import com.proyecto.Booking.persistence.entities.UserBook;
import com.proyecto.Booking.persistence.repository.BookRepository;
import com.proyecto.Booking.persistence.repository.UserBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBookService {
    @Autowired
    UserBookRepository userBookRepository;

    public void guardarBook(UserBook book){
        userBookRepository.save(book);
    }
    public List<UserBook> retornarTodosLosBooks(){
        return  userBookRepository.findAll();
    }
}
