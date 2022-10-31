package curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
