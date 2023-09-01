package com.careerquest.server.service;

import com.careerquest.server.dto.PostDTO;
import com.careerquest.server.model.PostModel;

import java.util.List;

public interface PostService {

    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}
