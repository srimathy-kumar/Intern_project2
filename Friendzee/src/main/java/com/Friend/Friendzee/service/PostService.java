package com.Friend.Friendzee.service;

import java.util.List;

import com.Friend.Friendzee.model.Post;

public interface PostService {

	Post addPost(Post post) throws Exception;

	List<Post> getPost();

}
