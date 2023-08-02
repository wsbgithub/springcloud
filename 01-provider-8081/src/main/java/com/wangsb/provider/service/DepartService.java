package com.wangsb.provider.service;

import com.wangsb.provider.entity.Depart;

import java.util.List;

/**
 * @author wangshenbing
 * @date 2023/08/02
 **/
public interface DepartService {
    Depart saveDepart(Depart depart);

    void deleteDepartById(Integer departId);

    Depart updateDepart(Depart depart);

    Depart getDepartById(Integer departId);

    List<Depart> getDepartList();
}