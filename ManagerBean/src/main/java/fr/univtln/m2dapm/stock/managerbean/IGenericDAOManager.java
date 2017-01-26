package fr.univtln.m2dapm.stock.managerbean;

import fr.univtln.m2dapm.stock.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stock.entities.interfaces.IAbstractEntity;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Maxime Gajovski on 05/01/2017.
 */
public interface IGenericDAOManager<PK extends Serializable, T extends IAbstractEntity<PK>> {
    T find(PK id) throws DAOException, DAOException;

    void delete(@Valid PK id) throws DAOException;

    List<T> findAll() throws DAOException;

    T add(@Valid T t) throws DAOException;

    T update(@Valid T t) throws DAOException;
}
