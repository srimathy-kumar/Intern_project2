package com.Friend.Friendzee.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Friend.Friendzee.model.Post;
import com.Friend.Friendzee.service.PostService;
 
@CrossOrigin(value="http://localhost:3000")
@RestController
@RequestMapping("/post")
public class PostController {
	
	private PostService postService;
	
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@PostMapping("/")
	public Post addPost(@RequestParam Map<String,String> requestParams) throws Exception {
		String strpost = requestParams.get("post");
		String email = requestParams.get("email");
		String name = requestParams.get("name");
		String file = requestParams.get("file");
		String profilePic = requestParams.get("profilePic");
	

		Post post =  Post.builder()
				.file(file)
				.name(name)
				.email(email)
				.post(strpost)
				.profilePic(profilePic)
				.timeStamp(new Date().toString())
				.build();
		post = postService.addPost(post);
		return post;
		
	}
	
	@GetMapping("/")
	public List<Post> getPost(){
		return postService.getPost();
		
	}
}
