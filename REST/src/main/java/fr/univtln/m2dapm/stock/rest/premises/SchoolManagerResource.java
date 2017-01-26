package fr.univtln.m2dapm.stock.rest.premises;

import fr.univtln.m2dapm.stock.entities.classes.premises.School;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.ISchool;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.premises.school.ISchoolManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
@RequestScoped
@Path("school/")
public class SchoolManagerResource extends GenericManagerResource<Long, ISchool, School> implements ISchoolManager<School> {

    @Inject
    @ManagerBean
    ISchoolManager schoolManager;

    @Override
    public IGenericDAOManager<Long, School> getDAOManager() {
        return schoolManager;
    }

}


