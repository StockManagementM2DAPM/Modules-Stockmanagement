package fr.univtln.m2dapm.stock.dao.classes.equipments;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.ISlideProjectorDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.SlideProjector;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.ISlideProjector;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
@JPADAO
public class SlideProjectorDAOJPA extends AbstractCrud<Long, ISlideProjector,SlideProjector>
        implements ISlideProjectorDAO {
    @Inject
    public SlideProjectorDAOJPA (@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
