/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log4j.main;

import com.log4j.dao.HelloWorldDAO;
import com.log4j.service.HelloWorldService;
import org.apache.log4j.Logger;

/**
 *
 * @author Heru Andriyatna
 */
public class Main {
    private static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Menginstankan DAO");
        HelloWorldDAO dao = new HelloWorldDAO();
        
        log.info("Menginstankan Service");
        HelloWorldService service = new HelloWorldService();
        
        log.debug("ini adalah debug message : ");
        service.debug();
        //service.setHelloWorldDAO(dao);
        
        log.info("ini adalah info message");
        dao.save();
        service.setHelloWorldDAO(dao);
        
        
        
        
    }
}
