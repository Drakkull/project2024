package amicosCode.test2024.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student judith= new Student("Judith","judith.biriba@gmail.com",LocalDate.of(1995, Month.JANUARY,7));

            Student chulapa= new Student("Chulapa","chulapa.biriba@gmail.com",LocalDate.of(1995, Month.JANUARY,7));


        repository.saveAll(List.of(judith,chulapa));
        };


    }

}
