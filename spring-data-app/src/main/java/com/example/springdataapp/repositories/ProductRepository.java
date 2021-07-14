package com.example.springdataapp.repositories;

import com.example.springdataapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}




































//    Optional<Student> findByName(String name);
//    List<Student> findAllByScoreBetweenAndIdGreaterThan(int min, int max, int minId);
//
//    @Query("select s from Student s where s.id = ?1 and s.name = ?2")
//    Optional<Student> customFinderById(Long id, String name);
