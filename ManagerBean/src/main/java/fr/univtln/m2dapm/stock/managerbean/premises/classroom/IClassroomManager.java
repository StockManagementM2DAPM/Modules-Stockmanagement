package fr.univtln.m2dapm.stock.managerbean.premises.classroom;

import fr.univtln.m2dapm.stock.entities.interfaces.premises.IClassRoom;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 11/01/2017.
 */
public interface IClassroomManager <T extends IClassRoom> extends IGenericDAOManager<Long, T> {
}
