/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log4j.dao;

import org.apache.log4j.Logger;



/**
 *
 * @author Heru Andriyatna
 */
public class HelloWorldDAO {
    private static final Logger logger = Logger.getLogger(HelloWorldDAO.class);
    
    public void save(){
        logger.info("ini untuk method save");
    }
    public void delete(Integer id){
        logger.info("method delete berjalan");
        if (logger.isDebugEnabled()) {
          logger.debug("id : "+id);
        } 
        if(id<0){
            throw new IllegalArgumentException("Id tidak boleh kurang dari 0");
        }
    }
}
