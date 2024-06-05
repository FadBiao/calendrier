package com.example.calendrier.controller;


import com.example.calendrier.entity.Calendrier;
import com.example.calendrier.service.ServiceCalendrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/calendrier")

public class CalendrierController {

    @Autowired
    private ServiceCalendrier serviceCalendrier;

    public CalendrierController(ServiceCalendrier serviceCalendrier) {
        this.serviceCalendrier = serviceCalendrier;
    }


    @GetMapping("/consulteCalendrier")
    public List<Calendrier> getAllCalendrier() {
        return serviceCalendrier.findAll();
    }


    @PostMapping("/create")
    public String createCalendrier(@RequestBody Calendrier calendrier)
    {
        serviceCalendrier.createCalendrier(calendrier);
        return "Cloud Vendor Created Successfully";
    }

    @DeleteMapping("/{id}")
    public Optional<Calendrier> findCalendrier(@PathVariable int id) {
        return serviceCalendrier.findById_Calendrier(id);
    }

    @PutMapping("/update")
    public String updateCalendrier(@RequestBody Calendrier calendrier)
    {
        serviceCalendrier.updateCalendrier(calendrier);
        return "Cloud Vendor Updated Successfully";
    }


}
