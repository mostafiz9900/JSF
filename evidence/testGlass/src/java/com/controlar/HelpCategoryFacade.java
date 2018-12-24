/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlar;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class HelpCategoryFacade extends AbstractFacade<HelpCategory> {

    @PersistenceContext(unitName = "testGlassPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HelpCategoryFacade() {
        super(HelpCategory.class);
    }
    
}
