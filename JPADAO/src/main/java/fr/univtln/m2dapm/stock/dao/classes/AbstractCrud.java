package fr.univtln.m2dapm.stock.dao.classes;

/**
 * Created by bruno on 01/12/14.
 * From http://www.adam-bien.com/roller/abien/entry/generic_crud_service_aka_dao
 * and http://theelitegentleman.blogspot.fr/2014/04/daos-as-ejbs-you-are-doing-it-wrong.html
 */

import fr.univtln.m2dapm.stock.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.entities.interfaces.IAbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.logging.Logger;

public class AbstractCrud<PK extends Serializable, D extends IAbstractEntity<PK>, T extends D> implements ICrud<PK, D> {
    private static Logger LOGGER = Logger.getLogger(AbstractCrud.class.getName());
    private EntityManager em;
    private int batchSize = 20;
    private Class<T> entityBeanType;

    public AbstractCrud(EntityManager em) {
        this();
        this.em = em;
    }

    public AbstractCrud() {
        Class c = getClass();
        //In case of use with implementation class using raw types (mandatory with EJBs).
        while (!(c.getGenericSuperclass() instanceof ParameterizedType)) {
            System.out.println(c);
            c = c.getSuperclass();
        }
        for (Type t : (((ParameterizedType) c.getGenericSuperclass()).getActualTypeArguments()))
            entityBeanType = ((Class) ((ParameterizedType) c.getGenericSuperclass()).getActualTypeArguments()[2]);
    }

    @Override
    public int getBatchSize() {
        return batchSize;
    }

    @Override
    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    @Override
    public <T extends D> T add(T t) {
        //em.joinTransaction();
        em.persist(t);
        em.flush();
        em.refresh(t);
        return t;
    }

    @Override
    public <T extends D> T find(PK id) {
        //em.joinTransaction();
        return (T) em.find(entityBeanType, id);
    }

    @Override
    public <T extends D> T update(T t) {
        //em.joinTransaction();
        return em.merge(t);
    }

    @Override
    public int delete() {
        //em.joinTransaction();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete<T> cdelete = cb.createCriteriaDelete(entityBeanType);
        Root<T> t = cdelete.from(entityBeanType);
        return em.createQuery(cdelete).executeUpdate();
    }

    @Override
    public <T1 extends D> List<T1> findAll() {
        //em.joinTransaction();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityBeanType);
        Root<T> t = cq.from(entityBeanType);
        cq.select(t);
        TypedQuery<T> q = em.createQuery(cq);
        return (List<T1>) q.getResultList();
    }

    @Override
    public void delete(PK id) {
        //em.joinTransaction();
        em.remove(em.find(entityBeanType, id));
    }

    @Override
    public int updateWithNamedQuery(String namedQueryName) {
        //em.joinTransaction();
        return em.createNamedQuery(namedQueryName).executeUpdate();
    }

    @Override
    public int updateWithNamedQuery(String namedQueryName, Map<String, Object> parameters) {
        //em.joinTransaction();
        Set<Map.Entry<String, Object>> rawParameters = parameters.entrySet();
        Query query = em.createNamedQuery(namedQueryName);
        for (Map.Entry<String, Object> entry : rawParameters) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.executeUpdate();
    }

    @Override
    public Object SingleWithNamedQuery(String namedQueryName) {
        //em.joinTransaction();
        return em.createNamedQuery(namedQueryName).getSingleResult();
    }

    @Override
    public T SingleTypedWithNamedQuery(String namedQueryName) {
        //em.joinTransaction();
        return em.createNamedQuery(namedQueryName, entityBeanType).getSingleResult();
    }


    @Override
    public List findWithNamedQuery(String namedQueryName) {
        //em.joinTransaction();
        return em.createNamedQuery(namedQueryName).getResultList();
    }

    @Override
    public List<T> findWithTypedNamedQuery(String queryName) {
        //em.joinTransaction();
        return em.createNamedQuery(queryName, entityBeanType).getResultList();
    }

    public List findWithNamedQuery(String namedQueryName, Map parameters) {
        //em.joinTransaction();
        return findWithNamedQuery(namedQueryName, parameters, 0);
    }

    @Override
    public List<T> findWithTypedNamedQuery(String namedQueryName, Map parameters) throws DAOException {
        //em.joinTransaction();
        return findWithTypedNamedQuery(namedQueryName, parameters, 0);
    }

    @Override
    public List findWithNamedQuery(String queryName, int resultLimit) {
        //em.joinTransaction();
        return em.createNamedQuery(queryName).
                setMaxResults(resultLimit).
                getResultList();
    }

    //todo: WRITE THE CODE
    @Override
    public List<T> findWithTypedNamedQuery(String queryName, int resultLimit) {
        //em.joinTransaction();
        return null;
    }

    @Override
    public List findByNativeQuery(String sql, Class type) {
        //em.joinTransaction();
        return em.createNativeQuery(sql, type).getResultList();
    }

    @Override
    public List findWithNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) {
        //em.joinTransaction();
        Set<Map.Entry<String, Object>> rawParameters = parameters.entrySet();
        Query query = em.createNamedQuery(namedQueryName);
        if (resultLimit > 0)
            query.setMaxResults(resultLimit);
        for (Map.Entry<String, Object> entry : rawParameters) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }

    @Override
    public <T extends D> List<T> findWithTypedNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) {
        //em.joinTransaction();
        Set<Map.Entry<String, Object>> rawParameters = parameters.entrySet();
        TypedQuery<T> query = (TypedQuery<T>) em.createNamedQuery(namedQueryName, entityBeanType);
        if (resultLimit > 0)
            query.setMaxResults(resultLimit);
        for (Map.Entry<String, Object> entry : rawParameters) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.getResultList();
    }

    @Override
    public <T extends D> int add(Iterator<T> iterator) {
        //em.joinTransaction();
        int nbAdded = 0;
        while (iterator.hasNext()) {
            em.persist(iterator.next());
            if (nbAdded++ % batchSize == 0) {
                em.flush();
                em.clear();
            }
        }
        em.flush();
        em.clear();
        return nbAdded;
    }

    public static class QueryParameter {

        private Map parameters = null;

        private QueryParameter(String name, Object value) {
            parameters = new HashMap();
            parameters.put(name, value);
        }

        public static QueryParameter with(String name, Object value) {
            return new QueryParameter(name, value);
        }

        public QueryParameter and(String name, Object value) {
            parameters.put(name, value);
            return this;
        }

        public Map parameters() {
            return parameters;
        }
    }

}
