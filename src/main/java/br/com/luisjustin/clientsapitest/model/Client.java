package br.com.luisjustin.clientsapitest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String estado;
    private String cidade;
    private String endereco;
    private String cep;
    private String telefone;
    private String celular;
    private String email;

}
