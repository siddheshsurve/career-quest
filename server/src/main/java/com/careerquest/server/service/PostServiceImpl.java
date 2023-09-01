package com.careerquest.server.service;

import com.careerquest.server.dao.PostDao;
import com.careerquest.server.dto.PostDTO;
import com.careerquest.server.model.PostModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;

    @Override
    public List<PostModel> getAllPosts() {
        return postDao.findAll();
    }

    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModal = new PostModel();

        postModal.setProfile(postDTO.getProfile());
        postModal.setType(postDTO.getType());
        postModal.setSalary(postDTO.getSalary());
        postModal.setExperience(postDTO.getExperience());
        postModal.setDescription(postDTO.getDescription());
        postModal.setTechnology(postDTO.getTechnology());

        return postDao.save(postModal);
    }
}
