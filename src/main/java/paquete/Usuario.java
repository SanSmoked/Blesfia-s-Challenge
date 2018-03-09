package paquete;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
    @Id
    private String username;
    public Usuario(String nombre){
        this.username = nombre;
    }

}
