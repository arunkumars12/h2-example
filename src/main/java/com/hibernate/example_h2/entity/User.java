package com.hibernate.example_h2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "APP_USER") // Renamed to avoid conflict
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,optional = false)
    @JoinColumns({
            @JoinColumn(name = "address_id", referencedColumnName = "address_id",nullable = false), // Maps to Address.id
            @JoinColumn(name = "address_city", referencedColumnName = "city",nullable = false) // Maps to Address.city
    })
    private Address address;

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    @JsonIgnore // Ignore lazy-loaded field
//    private Address address;
}