package fr.univtln.m2dapm.stock.rest.actors;

import fr.univtln.m2dapm.stock.entities.classes.actors.Teacher;
import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.teacher.ITeacherManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 11/01/2017.
 */
@RequestScoped
@Path("teacher/")
public class TeacherManagerResource extends GenericManagerResource<Long, ITeacher, Teacher> implements ITeacherManager<Teacher> {

    @Inject
    @ManagerBean

    ITeacherManager teacherManagerLocal;

    @Override
    public IGenericDAOManager<Long, Teacher> getDAOManager() {
        return teacherManagerLocal;
    }

}


