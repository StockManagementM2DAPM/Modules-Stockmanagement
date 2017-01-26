package fr.univtln.m2dapm.stock.dao.classes.premises;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.premises.IClassroomDAO;
import fr.univtln.m2dapm.stock.entities.classes.premises.ClassRoom;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.IClassRoom;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 17/12/2016.
 */

@JPADAO
public class ClassroomDAOJPA extends AbstractCrud<Long, IClassRoom,ClassRoom>
        implements IClassroomDAO{

    @Inject
    public ClassroomDAOJPA(@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
