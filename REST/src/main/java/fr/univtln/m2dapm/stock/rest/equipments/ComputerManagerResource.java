package fr.univtln.m2dapm.stock.rest.equipments;

import fr.univtln.m2dapm.stock.entities.classes.actors.Teacher;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerManager;
import fr.univtln.m2dapm.stock.managerbean.teacher.ITeacherManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */

@RequestScoped
@Path("equipment/computer/")
public class ComputerManagerResource extends GenericManagerResource<Long, IComputer, Computer> implements IComputerManager<Computer> {

    @Inject
    @ManagerBean
    IComputerManager computerManager;

    @Override
    public IGenericDAOManager<Long, Computer> getDAOManager() {
        return computerManager;
    }

}


