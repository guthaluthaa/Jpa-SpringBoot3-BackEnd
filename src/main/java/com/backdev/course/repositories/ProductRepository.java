package com.backdev.course.repositories;

import com.backdev.course.entities.Order;
import com.backdev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
