package com.house.services;

import com.house.entities.HouseInNewComplex;

import java.util.List;

public interface HouseInNewComplexService {

    void addHouse(HouseInNewComplex houseInNewComplex);
    boolean deleteHouseByID(int idHouse);
    HouseInNewComplex updateHouseByID(int idHouse);
    List<HouseInNewComplex> listOfHouseInNewComplex();
    HouseInNewComplex getHouseByID(int idHouse);

}
