package curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
