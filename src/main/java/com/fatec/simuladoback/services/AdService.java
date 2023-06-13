package com.fatec.simuladoback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.simuladoback.entities.Ad;
import com.fatec.simuladoback.repositories.AdRepository;

@Service
public class AdService {
    @Autowired
    private AdRepository repos;
}
