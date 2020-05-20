package pl.rafalab.rafdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalab.rafdit.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
