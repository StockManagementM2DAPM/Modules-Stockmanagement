package fr.univtln.m2dapm.stock.rest;

import fr.univtln.m2dapm.stock.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stock.entities.interfaces.IAbstractEntity;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Maxime Gajovski on 11/01/2017.
 */
@Stateless
@Local(IGenericDAOManager.class)
@Produces({"application/json", "application/xml"})
public abstract class GenericManagerResource<PK extends Serializable,
        I extends IAbstractEntity<PK>, T extends I> implements IGenericDAOManager<PK, T> {

    public abstract IGenericDAOManager<PK, T> getDAOManager();


    @GET
    @Path("{id}")
    @Override
    public T find(@PathParam("id") PK id) throws DAOException {
        return getDAOManager().find(id);
    }

    @DELETE
    @Path("{id}")
    @Override
    public void delete(@PathParam("id") PK id) throws DAOException {
        getDAOManager().delete(id);
    }

    @GET
    @Override
    public List<T> findAll() throws DAOException {
        return getDAOManager().findAll();
    }

    @PUT
    @Override
    @Consumes({"application/json", "application/xml"})
    public T add(T i) throws DAOException {
        return getDAOManager().add(i);
    }

    @POST
    @Override
    @Consumes({"application/json", "application/xml"})
    public T update(T i) throws DAOException {
        return getDAOManager().update(i);
    }
}
