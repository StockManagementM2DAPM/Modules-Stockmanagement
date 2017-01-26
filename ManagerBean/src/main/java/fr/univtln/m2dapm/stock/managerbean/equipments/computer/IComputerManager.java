package fr.univtln.m2dapm.stock.managerbean.equipments.computer;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
public interface IComputerManager <T extends IComputer> extends IGenericDAOManager<Long, T> {
}
