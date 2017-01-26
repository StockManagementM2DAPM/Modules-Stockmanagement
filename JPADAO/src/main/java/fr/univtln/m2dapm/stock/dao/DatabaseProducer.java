package fr.univtln.m2dapm.stock.dao;

import fr.univtln.m2dapm.stock.StockManagementDatabase;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Maxime Gajovski on 22/01/2017.
 */
public class DatabaseProducer {
    @Produces
    @PersistenceContext(unitName = "StockManagement")
    @StockManagementDatabase
    private EntityManager em;
}