package com.house.dao;

import com.house.entities.HouseInNewComplex;

import java.util.List;

public interface HouseInNewComplexDAO {

    void addHouse(HouseInNewComplex houseInNewComplex);
    boolean deleteHouseByID(int idHouse);
    HouseInNewComplex updateHouseByID(int idHouse);
    List<HouseInNewComplex> listOfHouseInNewComplex();
}
