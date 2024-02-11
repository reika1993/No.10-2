//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com10;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public List<Cat> getCats() {
        return catService.findCats();
    }

    @GetMapping("/cats/{name}")
    public List<Cat> getCatName(@PathVariable("name") String name) {
        return catService.findCatName(name);
    }


    @GetMapping("/cats/{age}")
    public List<Cat> getCatAge(@PathVariable("age") int age) {
        return catService.findCatAge(age);
    }

    @ExceptionHandler({CatNotFoundException.class})
    public ResponseEntity<Map<String, String>> handleCatNotFoundException(CatNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of("timestamp", ZonedDateTime.now().toString(), "status", String.valueOf(HttpStatus.NOT_FOUND.value()), "error", HttpStatus.NOT_FOUND.getReasonPhrase(), "message", e.getMessage(), "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}







