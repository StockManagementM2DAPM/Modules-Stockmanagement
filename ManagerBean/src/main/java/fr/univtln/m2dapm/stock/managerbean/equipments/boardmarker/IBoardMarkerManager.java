package fr.univtln.m2dapm.stock.managerbean.equipments.boardmarker;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
public interface IBoardMarkerManager <T extends IBoardMarker> extends IGenericDAOManager<Long, T> {
}
