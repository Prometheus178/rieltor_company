package com.house.dao;

import com.house.entities.HouseInNewComplex;

public interface HouseInNewComplexDAO {

    void addHouse(HouseInNewComplex houseInNewComplex);
    boolean deleteHouseByID(int idHouse);
    HouseInNewComplex updateHouseByID(int idHouse);

}
