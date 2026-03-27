package holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HolaMundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoApplication.class, args);
    }

    @GetMapping("/")
    public String hola() {
        return "Hola Mundo";
    }
}