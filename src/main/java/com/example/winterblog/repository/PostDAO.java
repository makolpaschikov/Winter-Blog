package com.example.winterblog.repository;

import com.example.winterblog.domain.Post;
import com.example.winterblog.domain.User;
import javafx.geometry.Pos;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository responsible for user posts in the database
 * @author makolpaschikov
 */
public interface PostDAO extends CrudRepository<Post, String> {
    List<Post> findPostByAuthor(User author);
    List<Post> findPostById(Long id);
    List<Post> findPostByTitleIsStartingWithAndAuthor(String filter, User user);
}
