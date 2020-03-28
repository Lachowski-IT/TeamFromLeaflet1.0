package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping ("/districts")
    public List<District> allDistricts() {

        return districtService.findAll();
    }


    @PostMapping ("/districts")
    public void add(@RequestBody District district) {
        districtService.create(district);
    }
}
