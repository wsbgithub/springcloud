package com.wangsb.provider.service.impl;

import com.wangsb.provider.entity.Depart;
import com.wangsb.provider.repository.DepartRepository;
import com.wangsb.provider.service.DepartService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangshenbing
 * @date 2023/08/03
 **/
@Service
public class DepartServiceImpl implements DepartService {
    private final DepartRepository departRepository;

    public DepartServiceImpl(DepartRepository departRepository) {
        this.departRepository = departRepository;
    }

    @Override
    public Depart saveDepart(Depart depart) {
        return departRepository.save(depart);
    }

    @Override
    public void deleteDepartById(Integer departId ) {
        departRepository.deleteById(departId);
    }

    @Override
    public Depart updateDepart(Depart depart) {
        return departRepository.save(depart);
    }

    @Override
    public Depart getDepartById(Integer departId) {
        return departRepository.getReferenceById(departId  )  ;
    }

     @Override
    public List<Depart> getDepartList() {
        return departRepository.findAll();
    }
}