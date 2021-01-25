package com.sharp.crm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.Comments;
import com.sharp.crm.model.Deal;
import com.sharp.crm.services.CommentsService;

@RestController
@RequestMapping("/api")
public class CommentsController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CommentsService commentsService;
	
	
	@PostMapping("/addComments")
	public Comments save(@RequestBody Comments comments) {
		log.info("Saving lead comments in the database.");
		return commentsService.saveComment(comments);

	}
	
	@GetMapping("/comments")
	public List<Comments> getComments() {
		return commentsService.getAllComments();
	}
	

	 @GetMapping("/comments/{id}") 
	    public Comments getComment(@PathVariable int id){
	        return commentsService.getCommentById(id);
	    }

}
