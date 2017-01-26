package fr.univtln.m2dapm.stock.dao.classes.equipments;

import fr.univtln.m2dapm.stock.StockManagementDatabase;
import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IEquipmentDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.AbstractEquipment;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IEquipment;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
@JPADAO
public class EquipmentDAOJPA extends AbstractCrud<Long, IEquipment, AbstractEquipment>
        implements IEquipmentDAO{

    @Inject
    public EquipmentDAOJPA(@StockManagementDatabase EntityManager entityManager) {
        super(entityManager);
    }

}
