package com.careerquest.server.controller;

import com.careerquest.server.constants.APIConstants;
import com.careerquest.server.dto.PostDTO;
import com.careerquest.server.model.PostModel;
import com.careerquest.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;
    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");

        return this.postService.savePost(postDTORequest);
    }

    @GetMapping(APIConstants.GET_ALL_POST)
    public List<PostModel> getAllPosts() {
        log.info("Getting all posts ####");
        return this.postService.getAllPosts();
    }


}
