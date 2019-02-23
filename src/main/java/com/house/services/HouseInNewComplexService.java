package com.house.services;

import com.house.entities.HouseInNewComplex;

public interface HouseInNewComplexService {

    void addHouse(HouseInNewComplex houseInNewComplex);
    boolean deleteHouseByID(int idHouse);
    HouseInNewComplex updateHouseByID(int idHouse);

}
