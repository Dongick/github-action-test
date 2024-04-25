package jate.project.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping(value = "/api/test")
    public ResponseEntity<String> test() {


        return ResponseEntity.ok("good");
    }
}
