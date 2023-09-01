package com.careerquest.server.service;

import com.careerquest.server.dto.PostDTO;
import com.careerquest.server.model.PostModel;

import java.util.List;

public interface PostService {

    public PostModel savePost(PostDTO post);

    public List<PostModel> getAllPosts();
}
