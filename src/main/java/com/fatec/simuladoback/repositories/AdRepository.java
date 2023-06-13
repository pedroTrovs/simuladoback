package com.fatec.simuladoback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.simuladoback.entities.Ad;

public interface AdRepository extends JpaRepository <Ad,Integer> {
    
}
