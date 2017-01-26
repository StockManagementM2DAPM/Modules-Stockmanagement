package fr.univtln.m2dapm.stock.rest.equipments;

import fr.univtln.m2dapm.stock.entities.classes.equipments.ChalkBox;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.chalkbox.IChalkBoxManager;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
@RequestScoped
@Path("equipment/chalkbox/")
public class ChalkBoxManagerResource extends GenericManagerResource<Long, IChalkBox, ChalkBox> implements IChalkBoxManager<ChalkBox> {

    @Inject
    @ManagerBean
    IChalkBoxManager chalkBoxManager;

    @Override
    public IGenericDAOManager<Long, ChalkBox> getDAOManager() {
        return chalkBoxManager;
    }

}


