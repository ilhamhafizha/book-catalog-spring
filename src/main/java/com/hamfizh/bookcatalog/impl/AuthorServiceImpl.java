package com.hamfizh.bookcatalog.impl;

import com.hamfizh.bookcatalog.domain.Author;
import com.hamfizh.bookcatalog.dto.AuthorCreateRequestDTO;
import com.hamfizh.bookcatalog.dto.AuthorResponDTO;
import com.hamfizh.bookcatalog.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService {

//    private final List<Author> authorList = new ArrayList<>();


        private  List<Author> authorList;

        public AuthorServiceImpl(List<Author> authorList) {
            super();
            this.authorList = authorList;
        }

    @Override
    public List<AuthorResponDTO> findAuthorList() {
        return authorList.stream().map(a -> {
            return new AuthorResponDTO(a.getName(), a.getDescription());
        }).collect(Collectors.toList());
    }

    @Override
    public void createNewAuthor(AuthorCreateRequestDTO dto) {
        Author author = new Author();
        author.setName(dto.name());
        author.setDescription(dto.description());
        authorList.add(author);
    }
}
