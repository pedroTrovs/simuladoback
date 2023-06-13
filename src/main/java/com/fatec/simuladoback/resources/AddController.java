package com.fatec.simuladoback.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.simuladoback.entities.Ad;
import com.fatec.simuladoback.services.AdService;

@RestController
public class AddController {
    @Autowired
    private AdService service;

    public Ad save(Ad obj)
    {
        return service.saveAd(obj);
    }
}
