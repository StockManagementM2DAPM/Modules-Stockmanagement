package fr.univtln.m2dapm.stock.dao.classes.equipments;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IComputerDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */

@JPADAO
public class ComputerDAOJPA extends AbstractCrud<Long, IComputer,Computer>
        implements IComputerDAO {

    @Inject
    public ComputerDAOJPA (@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
