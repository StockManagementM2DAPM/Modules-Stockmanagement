package fr.univtln.m2dapm.stock.managerbean.equipments.chalkbox;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
public interface IChalkBoxManager <T extends IChalkBox> extends IGenericDAOManager<Long, T> {
}
