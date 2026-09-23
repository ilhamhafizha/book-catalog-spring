package com.hamfizh.bookcatalog.controller;

import com.hamfizh.bookcatalog.domain.Author;
import com.hamfizh.bookcatalog.dto.AuthorCreateRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("author")
public class AuthorContoller {
    @GetMapping("new")
    public String displayCreateAuthorForm(Model model){
        model.addAttribute("authorDTO", new AuthorCreateRequestDTO(null, null));
        return "author/author-new";
    }

    @PostMapping("new")
    public String createAuthor(@ModelAttribute("authorDTO") AuthorCreateRequestDTO authorDTO){
        log.info("Author Name: " + authorDTO.name());
        log.info("Author Description: " + authorDTO.description());
        return "redirect:/author/new";
    }
}
