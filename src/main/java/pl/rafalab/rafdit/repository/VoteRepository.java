package pl.rafalab.rafdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalab.rafdit.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
