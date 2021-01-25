package com.sharp.crm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharp.crm.model.Comments;
import com.sharp.crm.repo.CommentsRepository;

@Service
public class CommentsService {
	
	@Autowired
	CommentsRepository commentsRepository;

	//Save Lead Comments
	public Comments saveComment(Comments comments) {
		return commentsRepository.save(comments);
	}

	//Get All Comments
	public List<Comments> getAllComments() {
		return commentsRepository.findAll();
	}

	public Comments getCommentById(int id) {
		// TODO Auto-generated method stub
		return commentsRepository.findById(id).orElse(null);
	}

}
