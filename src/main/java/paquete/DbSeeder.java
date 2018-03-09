package paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


@Component
public class DbSeeder implements CommandLineRunner{
    private UsuarioRepository usuarioRepository;

    @Autowired
    public DbSeeder(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }



    @Override
    public void run(String... strings)throws Exception{

        Usuario pepito = new Usuario(
                "pepito"
        );
        Usuario juanito = new Usuario(
                "juanito"
        );
        Usuario capriati = new Usuario(
                "capriati"
        );





        this.usuarioRepository.deleteAll();

        //List<Usuario> usuarios = Arrays.asList(pepito,juanito,capriati);
        this.usuarioRepository.save(pepito);
        this.usuarioRepository.save(juanito);
        this.usuarioRepository.save(capriati);

    }
}
