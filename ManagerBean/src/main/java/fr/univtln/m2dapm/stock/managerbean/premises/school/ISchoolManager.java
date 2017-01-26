package fr.univtln.m2dapm.stock.managerbean.premises.school;

import fr.univtln.m2dapm.stock.entities.interfaces.premises.ISchool;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */

public interface ISchoolManager <T extends ISchool> extends IGenericDAOManager<Long, T> {
}
