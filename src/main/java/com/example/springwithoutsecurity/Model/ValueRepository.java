package com.example.springwithoutsecurity.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ValueRepository extends JpaRepository<Value, Long> {
    @Query("SELECT p FROM Value p WHERE CONCAT( p.value1, ' ', p.value2 ) LIKE %?1%")
    public List<Value> search(String keyword);
}