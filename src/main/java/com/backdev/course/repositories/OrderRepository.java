package com.backdev.course.repositories;

import com.backdev.course.entities.Order;
import com.backdev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
