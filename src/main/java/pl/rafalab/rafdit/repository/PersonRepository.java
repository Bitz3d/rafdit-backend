package pl.rafalab.rafdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalab.rafdit.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
