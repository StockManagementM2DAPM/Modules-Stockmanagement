package fr.univtln.m2dapm.stock.managerbean;

import fr.univtln.m2dapm.stock.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.entities.interfaces.IAbstractEntity;

import javax.ejb.*;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Maxime Gajovski on 04/01/2017.
 */


//@Stateless
@Local(IGenericDAOManager.class)
@Transactional
//@TransactionManagement(TransactionManagementType.CONTAINER)
//@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class GenericManagerBean<PK extends Serializable, Interface extends IAbstractEntity<PK>,
        T extends Interface> implements IGenericDAOManager<PK, T> {

    private static final Logger logger = Logger.getLogger(String.valueOf(GenericManagerBean.class));

    public abstract ICrud<PK, Interface> getAbstractCrud();

    @Override
    public T find(PK id) throws DAOException {
        return getAbstractCrud().find(id);
    }

    @Override
    public void delete(@Valid PK id) throws DAOException {
        getAbstractCrud().delete(id);
    }

    @Override
    public List<T> findAll() throws DAOException {
        return getAbstractCrud().findAll();
    }

    @Override
    public T add(@Valid T t) throws DAOException {
        return getAbstractCrud().add(t);
    }

    @Override
    public T update(@Valid T anInterface) throws DAOException {
        return getAbstractCrud().update(anInterface);
    }
}
