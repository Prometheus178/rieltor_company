package com.house.controllers;

import com.house.entities.HouseInNewComplex;
import com.house.entities.Status;
import com.house.services.HouseInNewComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HouseInNewComplexController {

    @Qualifier("houseInNewComplexServiceImpl")
    @Autowired
    private HouseInNewComplexService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView listOfHouseInNewComplex(){
        ModelAndView modelAndView = new ModelAndView("main");
        modelAndView.addObject("listOfHouseInNewComplex", service.listOfHouseInNewComplex());
        return modelAndView;
    }

    @RequestMapping(value = "/addHouseInNewComplex" , method = RequestMethod.POST)
    public ModelAndView houseAdd(@RequestParam(value = "nameOfComplex") String nameOfComplex,
                                 @RequestParam(value = "nameOfHouse") String nameOfHouse,
                                 @RequestParam(value = "floor") int floor,
                                 @RequestParam(value =  "apartment") int apartment,
                                 @RequestParam(value = "square") double square,
                                 @RequestParam(value = "price") int price,
                                 @RequestParam(value = "fullPrice") int fullPrice,
                                 @RequestParam(value = "status") Status status,
                                 HouseInNewComplex houseInNewComplex) throws Exception{
        ModelAndView modelAndView = new ModelAndView("main");
        try {
            houseInNewComplex.setNameOfComplex(nameOfComplex);
            houseInNewComplex.setNameOfHouse(nameOfHouse);
            houseInNewComplex.setFloor(floor);
            houseInNewComplex.setApartment(apartment);
            houseInNewComplex.setSquare(square);
            houseInNewComplex.setPrice(price);
            houseInNewComplex.setFullPrice(fullPrice);
            houseInNewComplex.setStatus(status);
            service.addHouse(houseInNewComplex);
            modelAndView.addObject("addMessage","House added " + houseInNewComplex.getNameOfComplex());
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            return modelAndView;
        }

    }



    @RequestMapping(value = "/removeHouseFromNewComplex/{idHouse}", method = RequestMethod.GET)
    public String removeHouseFromNewComplex(@PathVariable("idHouse") int idHouse, Model model){
        if (service.deleteHouseByID(idHouse)){
            model.addAttribute("removed");
        }else {
            model.addAttribute("something wrong");
        }
        return "main";
    }


}
