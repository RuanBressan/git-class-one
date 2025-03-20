package com.teste.teste.repository;

import com.teste.teste.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    Optional<ClientModel> findById(int id);

    Optional<ClientModel> findAllById(int id);
}
