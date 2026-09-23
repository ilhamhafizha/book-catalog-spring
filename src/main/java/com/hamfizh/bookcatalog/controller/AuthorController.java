package com.hamfizh.bookcatalog.controller;

import com.hamfizh.bookcatalog.dto.AuthorCreateRequestDTO;
import com.hamfizh.bookcatalog.dto.AuthorResponDTO;
import com.hamfizh.bookcatalog.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("author")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("new")
    public String displayCreateAuthorForm(Model model){
        model.addAttribute("authorDTO", new AuthorCreateRequestDTO(null, null));
        return "author/author-new";
    }

    @PostMapping("new")
    public String createAuthor(@ModelAttribute("authorDTO") AuthorCreateRequestDTO authorDTO,
                               RedirectAttributes redirectAttr){
        log.info("Author Name: " + authorDTO.name());
        log.info("Author Description: " + authorDTO.description());
        authorService.createNewAuthor(authorDTO);
        redirectAttr.addFlashAttribute("authorDTO", authorDTO);
        return "redirect:/author/create-result";
    }

    @GetMapping("list")
    public String displayAuthorList(Model model){
        List<AuthorResponDTO> authorList =  authorService.findAuthorList();
        model.addAttribute("authors",authorList);
        return "author/author-list";
    }


    @GetMapping("create-result")
    public String DisplayCreateResult(Model model){
        return "author/author-create-result";
    }
}
