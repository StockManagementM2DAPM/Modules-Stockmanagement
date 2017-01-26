package fr.univtln.m2dapm.stock.dao.classes;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ITeacherDAO;
import fr.univtln.m2dapm.stock.entities.classes.actors.Teacher;
import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 17/12/2016.
 */

@JPADAO
public class TeacherDAOJPA extends AbstractCrud<Long, ITeacher,Teacher>
        implements ITeacherDAO{

    @Inject
    public TeacherDAOJPA(@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
