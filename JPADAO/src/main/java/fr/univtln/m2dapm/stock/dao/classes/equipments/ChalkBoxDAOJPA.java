package fr.univtln.m2dapm.stock.dao.classes.equipments;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IChalkBoxDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.ChalkBox;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;


import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
@JPADAO
public class ChalkBoxDAOJPA extends AbstractCrud<Long, IChalkBox,ChalkBox>
        implements IChalkBoxDAO {

    @Inject
    public ChalkBoxDAOJPA (@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
