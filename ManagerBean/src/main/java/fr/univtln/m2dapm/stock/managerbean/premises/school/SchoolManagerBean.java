package fr.univtln.m2dapm.stock.managerbean.premises.school;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.premises.ISchoolDAO;
import fr.univtln.m2dapm.stock.entities.classes.premises.School;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.ISchool;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.premises.classroom.IClassroomLocal;
import fr.univtln.m2dapm.stock.managerbean.premises.classroom.IClassroomRemote;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
@Stateless
@ManagerBean
@Local
public class SchoolManagerBean extends GenericManagerBean<Long, ISchool, School>
        implements ISchoolLocal<School>, ISchoolRemote<School> {

    @JPADAO
    @Inject
    ISchoolDAO schoolDAO;

    @Override
    public ICrud<Long, ISchool> getAbstractCrud() {
        return schoolDAO;
    }
}
