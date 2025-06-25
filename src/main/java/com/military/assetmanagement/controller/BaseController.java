package com.military.assetmanagement.controller;


import com.military.assetmanagement.model.Base;
import com.military.assetmanagement.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bases")
@CrossOrigin(origins = "*")
public class BaseController {

    @Autowired
    private BaseRepository baseRepository;

    @GetMapping
    public List<Base> getAllBases() {
        return baseRepository.findAll();
    }

    @PostMapping
    public Base createBase(@RequestBody Base base) {
        return baseRepository.save(base);
    }
}
