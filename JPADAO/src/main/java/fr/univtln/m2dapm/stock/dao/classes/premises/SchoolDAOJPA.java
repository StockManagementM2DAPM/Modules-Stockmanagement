package fr.univtln.m2dapm.stock.dao.classes.premises;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.premises.ISchoolDAO;
import fr.univtln.m2dapm.stock.entities.classes.premises.School;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.ISchool;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
@JPADAO
public class SchoolDAOJPA extends AbstractCrud<Long, ISchool,School>
        implements ISchoolDAO{

    @Inject
    public SchoolDAOJPA(@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
