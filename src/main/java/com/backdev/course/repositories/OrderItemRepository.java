package com.backdev.course.repositories;

import com.backdev.course.entities.Category;
import com.backdev.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
