package fr.univtln.m2dapm.stock.rest.equipments;

import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.classes.equipments.SlideProjector;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.ISlideProjector;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerManager;
import fr.univtln.m2dapm.stock.managerbean.equipments.slideprojector.ISlideProjectorManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
@RequestScoped
@Path("equipment/slide_projector/")
public class SlideProjectorManagerResource extends GenericManagerResource<Long, ISlideProjector, SlideProjector> implements ISlideProjectorManager<SlideProjector> {

    @Inject
    @ManagerBean
    ISlideProjectorManager slideProjectorManager;

    @Override
    public IGenericDAOManager<Long, SlideProjector> getDAOManager() {
        return slideProjectorManager;
    }

}

