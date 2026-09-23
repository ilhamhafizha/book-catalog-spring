package com.hamfizh.bookcatalog.service;

import com.hamfizh.bookcatalog.dto.AuthorCreateRequestDTO;
import com.hamfizh.bookcatalog.dto.AuthorResponDTO;

import java.util.List;

public interface AuthorService {

    public List<AuthorResponDTO> findAuthorList();
    public void createNewAuthor(AuthorCreateRequestDTO dto);
}
