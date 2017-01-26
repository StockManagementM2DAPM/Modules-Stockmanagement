package fr.univtln.m2dapm.stock.managerbean.teacher;

import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 05/01/2017.
 */
public interface ITeacherManager<T extends ITeacher> extends IGenericDAOManager<Long, T> {
}
