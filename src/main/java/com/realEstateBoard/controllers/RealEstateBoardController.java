package com.realEstateBoard.controllers;

import com.realEstateBoard.services.RealEstateBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RealEstateBoardController {

    @Autowired
    RealEstateBoardService service;

    @RequestMapping(value = "/addPoster", method = RequestMethod.GET)
    ModelAndView addPosterView(){
        ModelAndView modelAndView = new ModelAndView("addPoster");
        return modelAndView;
    }


}
