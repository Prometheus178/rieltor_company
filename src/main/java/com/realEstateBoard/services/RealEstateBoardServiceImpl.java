package com.realEstateBoard.services;

import com.realEstateBoard.dao.RealEstateBoardDAO;
import com.realEstateBoard.entities.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RealEstateBoardServiceImpl implements  RealEstateBoardService{

    @Autowired
    RealEstateBoardDAO realEstateBoardDAO;

    @Transactional
    public void addPoster(Poster poster) {
        realEstateBoardDAO.addPoster(poster);
    }

    @Override
    public void deletePosterByID(Poster poster) {

    }

    @Override
    public Poster updatePosterById(Poster poster) {
        return null;
    }

    @Override
    public List<Poster> listOfPoster() {
        return null;
    }

    @Override
    public Poster getPosterByID(int idPoster) {
        return null;
    }
}
