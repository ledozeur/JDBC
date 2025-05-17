package ru.netology.jdbs;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class Controller {
    JdbcRepository jdbcRepository;

    public Controller(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }
    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return Collections.singletonList(jdbcRepository.getProductName(name));
    }

}
