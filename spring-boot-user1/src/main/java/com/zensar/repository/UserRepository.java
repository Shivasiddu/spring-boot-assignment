package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensarspringbootdemo.entity.Details;

public interface UserRepository extends JpaRepository<Details, Integer> {

}
