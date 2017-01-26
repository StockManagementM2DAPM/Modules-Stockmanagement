package fr.univtln.m2dapm.stock.managerbean.teacher;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.ITeacherDAO;
import fr.univtln.m2dapm.stock.entities.classes.actors.Teacher;
import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Maxime Gajovski on 05/01/2017.
 */
@ManagerBean
@Stateless
@Local
public class TeacherManagerBean extends GenericManagerBean<Long, ITeacher, Teacher>
        implements ITeacherManagerLocal<Teacher>, ITeacherManagerRemote<Teacher> {

    @Inject
    @JPADAO
    ITeacherDAO teacherDAO;

    @Override
    public ICrud<Long, ITeacher> getAbstractCrud() {
        return teacherDAO;
    }
}
