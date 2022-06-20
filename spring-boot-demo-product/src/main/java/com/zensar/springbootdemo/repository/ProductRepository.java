package com.zensar.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.springbootdemo.entity.*;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("from Product c  where c.productCode=code or c.productId=idd")
	List<Product> com3(@Param("code") String productCode, @Param("idd") int productId);

	List<Product> test(String productCode);

	List<Product> test1(String productCode, int productId);

	List<Product> test2(String productCode, int productId);

}