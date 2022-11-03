package curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
