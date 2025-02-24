package com.indeed.server.controller;

import com.indeed.server.dto.PostDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class PostController {

    @PostMapping('/post')
    public  void savePost(@Validated @RequestBody PostDTO postDTORequest){
        log.info("Saving Post");

    }
}
