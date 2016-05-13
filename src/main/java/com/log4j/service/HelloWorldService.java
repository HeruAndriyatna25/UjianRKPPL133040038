/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log4j.service;

import com.log4j.dao.HelloWorldDAO;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Heru Andriyatna
 */
public class HelloWorldService {
    private static final Logger logger = Logger.getLogger(HelloWorldService.class);
    private HelloWorldDAO helloWorldDAO;
    
    public void setHelloWorldDAO(HelloWorldDAO helloWorldDAO){
        this.helloWorldDAO = helloWorldDAO;
    }
    public void debug(){
        logger.log(Level.DEBUG, "ini adalah debug Message");
    }
}
