package com.realEstateBoard.dao;

import com.realEstateBoard.entities.Poster;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RealEstateBoardDAOImpl implements RealEstateBoardDAO{

    @Autowired
    SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }

    @Override
    public void addPoster(Poster poster) {
        Session session = sessionFactory.getCurrentSession();
        session.save(poster);
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
