package br.com.luisjustin.clientsapitest.repository;

import br.com.luisjustin.clientsapitest.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{}
