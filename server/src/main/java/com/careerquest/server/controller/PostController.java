package com.careerquest.server.controller;

import com.careerquest.server.dto.PostDTO;
import com.careerquest.server.model.PostModel;
import com.careerquest.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;
    @PostMapping("/post")
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");

        return this.postService.savePost(postDTORequest);
    }

}
