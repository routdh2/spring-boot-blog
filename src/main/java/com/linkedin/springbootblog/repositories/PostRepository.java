package com.linkedin.springbootblog.repositories;

import com.linkedin.springbootblog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
