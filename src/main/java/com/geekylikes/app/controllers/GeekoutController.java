package com.geekylikes.app.controllers;

import com.geekylikes.app.models.Geekout;
import com.geekylikes.app.repositories.GeekoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/geekouts")
public class GeekoutController {
    @Autowired
    private GeekoutRepository repository;

    @GetMapping
    public ResponseEntity<Iterable<Geekout>> getAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Geekout> createOne(@RequestBody Geekout geekout) {
        System.out.println(geekout.getDeveloper().getId());

        return new ResponseEntity<>(repository.save(geekout), HttpStatus.CREATED);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Geekout> updateOneById(@RequestBody Geekout geekout, @PathVariable Long id) {
//        similar to developer update.
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOneById(@PathVariable Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping("/dev/{devId}")
    public ResponseEntity<List<Geekout>> getByDevId(@PathVariable Long devId) {
        return new ResponseEntity<>(repository.findByDeveloperId(devId), HttpStatus.OK);
    }


}