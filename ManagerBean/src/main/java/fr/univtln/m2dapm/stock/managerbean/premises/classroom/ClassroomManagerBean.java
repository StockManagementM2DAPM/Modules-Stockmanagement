package fr.univtln.m2dapm.stock.managerbean.premises.classroom;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.premises.IClassroomDAO;
import fr.univtln.m2dapm.stock.entities.classes.premises.ClassRoom;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.IClassRoom;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Maxime Gajovski on 11/01/2017.
 */
@Stateless
@ManagerBean
@Local
//@Local(IClassroomLocal.class)
//@Remote(IClassroomRemote.class)
public class ClassroomManagerBean extends GenericManagerBean<Long, IClassRoom, ClassRoom>
        implements IClassroomLocal<ClassRoom>, IClassroomRemote<ClassRoom> {

    @JPADAO
    @Inject
    IClassroomDAO classroomDAO;

    @Override
    public ICrud<Long, IClassRoom> getAbstractCrud() {
        return classroomDAO;
    }
}
