package pl.rafalab.rafdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalab.rafdit.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
