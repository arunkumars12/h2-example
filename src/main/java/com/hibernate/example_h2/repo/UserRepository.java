package com.hibernate.example_h2.repo;

import com.hibernate.example_h2.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

//    @Override
//    @EntityGraph(attributePaths = {"address"},type = EntityGraph.EntityGraphType.LOAD)
//    List<User> findAll();
}



