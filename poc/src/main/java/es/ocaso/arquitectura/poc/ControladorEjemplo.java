package es.ocaso.arquitectura.poc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/controladorEjemplo")
public class ControladorEjemplo {
    @GetMapping("/hola")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        return response;
    }

}

