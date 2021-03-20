package br.com.brunoxkk0.data.model.user;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Introspected
public class User {

    @Id
    @Size(min = 3, max = 16)
    private String username;


    @Size(min = 6, max = 16)
    private String password;

}
