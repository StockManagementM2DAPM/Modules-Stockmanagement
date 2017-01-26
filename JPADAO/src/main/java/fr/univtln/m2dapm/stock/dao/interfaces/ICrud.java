package fr.univtln.m2dapm.stock.dao.interfaces;

import fr.univtln.m2dapm.stock.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stock.entities.interfaces.IAbstractEntity;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by bruno on 01/12/14.
 * From http://www.adam-bien.com/roller/abien/entry/generic_crud_service_aka_dao
 * and http://theelitegentleman.blogspot.fr/2014/04/daos-as-ejbs-you-are-doing-it-wrong.html
 */

//todo: cleanup the basic method List
public interface ICrud<PK extends Serializable, D extends IAbstractEntity<PK>> {
    int getBatchSize();

    void setBatchSize(int i);

    <T extends D> T add(T t) throws DAOException;

    <T extends D> T find(PK id) throws DAOException;

    <T extends D> T update(T t) throws DAOException;

    <T extends D> List<T> findAll() throws DAOException;

    int delete() throws DAOException;

    void delete(PK id) throws DAOException;

    int updateWithNamedQuery(String namedQueryName) throws DAOException;

    int updateWithNamedQuery(String namedQueryName, Map<String, Object> parameters) throws DAOException;

    List<?> findWithNamedQuery(String queryName) throws DAOException;

    List<?> findByNativeQuery(String sql, Class type) throws DAOException;

    <T extends D> List<T> findWithTypedNamedQuery(String queryName) throws DAOException;

    List<?> findWithNamedQuery(String queryName, int resultLimit) throws DAOException;

    <T extends D> List<T> findWithTypedNamedQuery(String queryName, int resultLimit) throws DAOException;

    List<?> findWithNamedQuery(String namedQueryName, Map parameters) throws DAOException;

    <T extends D> List<T> findWithTypedNamedQuery(String namedQueryName, Map parameters) throws DAOException;

    List<?> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) throws DAOException;

    <T extends D> List<T> findWithTypedNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) throws DAOException;

    <T extends D> int add(Iterator<T> iterator) throws DAOException;

    Object SingleWithNamedQuery(String namedQueryName) throws DAOException;

    <T extends D> T SingleTypedWithNamedQuery(String namedQueryName) throws DAOException;
}
