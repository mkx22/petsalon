package njuics.demos.petsalon;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(OwnerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Owner("Bilbo Baggins")));
            log.info("Preloading " + repository.save(new Owner("Frodo Baggins")));
        };
    }
}
