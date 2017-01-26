package fr.univtln.m2dapm.stock.managerbean.equipments.slideprojector;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.ISlideProjector;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
public interface ISlideProjectorManager <T extends ISlideProjector> extends IGenericDAOManager<Long, T> {
}
