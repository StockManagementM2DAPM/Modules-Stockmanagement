package fr.univtln.m2dapm.stock.dao.classes.equipments;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IBoardMarkerDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.BoardMarker;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */

@JPADAO
public class BoardMarkerDAOJPA extends AbstractCrud<Long, IBoardMarker,BoardMarker>
        implements IBoardMarkerDAO {

    @Inject
    public BoardMarkerDAOJPA (@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
