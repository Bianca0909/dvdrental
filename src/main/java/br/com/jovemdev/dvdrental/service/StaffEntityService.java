package br.com.jovemdev.dvdrental.service;

import br.com.jovemdev.dvdrental.entity.StaffEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StaffEntityService {
    StaffEntity findById(Long id);

    List<StaffEntity> findAll();

    StaffEntity save(StaffEntity staffEntity);
}
