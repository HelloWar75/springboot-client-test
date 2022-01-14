package br.com.luisjustin.clientsapitest.controller;

import br.com.luisjustin.clientsapitest.model.Client;
import br.com.luisjustin.clientsapitest.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping({"/clients"})
public class ClientController {

    private ClientRepository repository;

    ClientController(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }

    @GetMapping
    public List<Client> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return repository.save(client);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable("id") long id, @RequestBody Client client) {
        return repository.findById(id)
                .map(record -> {
                    record.setNome(client.getNome());
                    record.setCpf(client.getCpf());
                    record.setEstado(client.getEstado());
                    record.setCidade(client.getCidade());
                    record.setEndereco(client.getEndereco());
                    record.setCep(client.getCep());
                    record.setTelefone(client.getTelefone());
                    record.setCelular(client.getCelular());
                    record.setEmail(client.getEmail());
                    Client updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity <?> delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }


}
