package ma.emsi.tp_data;

import ma.emsi.tp_data.enums.Genre;
import ma.emsi.tp_data.model.Etudiant;
import ma.emsi.tp_data.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TpDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TpDataApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String ...args) throws Exception {
        List<Etudiant> le = List.of(
                Etudiant.builder()
                        .nom("TARAR")
                        .prenom("Ayman")
                        .genre(Genre.Homme)
                        .build(),
                Etudiant.builder()
                        .nom("TARAR")
                        .prenom("Oussama")
                        .genre(Genre.Homme)
                        .build(),
                Etudiant.builder()
                        .nom("SADOUNI")
                        .prenom("Younes")
                        .genre(Genre.Homme)
                        .build(),
                Etudiant.builder()
                        .nom("MOUSTAOUI")
                        .prenom("Mohamed")
                        .genre(Genre.Homme)
                        .build(),
                Etudiant.builder()
                        .nom("TARAR")
                        .prenom("Ziad")
                        .genre(Genre.Homme)
                        .build(),
                Etudiant.builder()
                        .nom("SAMADI")
                        .prenom("Leila")
                        .genre(Genre.Homme)
                        .build()
        );
        etudiantRepository.saveAll(le);
    }

}
