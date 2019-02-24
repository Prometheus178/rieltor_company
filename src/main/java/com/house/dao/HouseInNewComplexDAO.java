package com.house.dao;

import com.house.entities.HouseInNewComplex;

import java.util.List;

public interface HouseInNewComplexDAO {

    void addHouse(HouseInNewComplex houseInNewComplex);
    void deleteHouseByID(HouseInNewComplex houseInNewComplex);
    HouseInNewComplex updateHouseByID(int idHouse);
    List<HouseInNewComplex> listOfHouseInNewComplex();
}
