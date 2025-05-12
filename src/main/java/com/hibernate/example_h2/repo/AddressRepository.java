package com.hibernate.example_h2.repo;

import com.hibernate.example_h2.entity.Address;
import com.hibernate.example_h2.entity.AddressId;
import com.hibernate.example_h2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, AddressId> {}