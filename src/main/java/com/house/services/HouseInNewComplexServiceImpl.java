package com.house.services;

import com.house.dao.HouseInNewComplexDAO;
import com.house.entities.HouseInNewComplex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HouseInNewComplexServiceImpl implements HouseInNewComplexService {

    @Autowired
    HouseInNewComplexDAO houseInNewComplexDAO;

    public void setHouseInNewComplexDAO(HouseInNewComplexDAO houseInNewComplexDAO){
        this.houseInNewComplexDAO = houseInNewComplexDAO;
    }

    @Transactional
    public void addHouse(HouseInNewComplex houseInNewComplex) {
        houseInNewComplexDAO.addHouse(houseInNewComplex);
    }

    public boolean deleteHouseByID(int idHouse) {
        houseInNewComplexDAO.deleteHouseByID(idHouse);
        return true;
    }

    public HouseInNewComplex updateHouseByID(int idHouse) {
        return null;
    }
}
