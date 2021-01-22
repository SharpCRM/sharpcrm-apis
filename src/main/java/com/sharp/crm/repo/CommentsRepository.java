package com.sharp.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharp.crm.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{

}
