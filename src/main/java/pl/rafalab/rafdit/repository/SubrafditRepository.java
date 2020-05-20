package pl.rafalab.rafdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalab.rafdit.model.Subrafdit;

@Repository
public interface SubrafditRepository extends JpaRepository<Subrafdit, Long> {
}
