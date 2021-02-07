package com.sharp.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharp.crm.model.Comments;
import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Integer>{


    List<Comments> findByReferenceId(int id);
}
