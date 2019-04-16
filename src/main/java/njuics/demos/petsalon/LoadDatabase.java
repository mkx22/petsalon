package njuics.demos.petsalon;

import lombok.extern.slf4j.Slf4j;

import njuics.demos.petsalon.model.Owner;
import njuics.demos.petsalon.repository.OwnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(OwnerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Owner()));
            log.info("Preloading " + repository.save(new Owner()));
        };
    }
}
