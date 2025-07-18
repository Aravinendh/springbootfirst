package com.example.demo.repository;

import com.example.demo.models.RegisterDetails;
import com.example.demo.models.UserDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails, Integer> {
    RegisterDetails findByEmail(String email);

    Optional<RegisterDetails> findByUserName(String username);

    @Query("SELECT r FROM RegisterDetails r JOIN r.roles role WHERE role.roleName = :roleName")
    Optional<RegisterDetails> findByRole(@Param("roleName") String roleName);

    List<RegisterDetails> findByNameContainingIgnoreCase(String name);
}
