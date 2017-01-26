package fr.univtln.m2dapm.stock.rest.equipments;

import fr.univtln.m2dapm.stock.entities.classes.equipments.BoardMarker;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.managerbean.IGenericDAOManager;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.boardmarker.IBoardMarkerManager;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerManager;
import fr.univtln.m2dapm.stock.rest.GenericManagerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */
@RequestScoped
@Path("equipment/board_marker/")
public class BoardMarkerManagerResource extends GenericManagerResource<Long, IBoardMarker, BoardMarker> implements IBoardMarkerManager<BoardMarker> {

    @Inject
    @ManagerBean
    IBoardMarkerManager boardMarkerManager;

    @Override
    public IGenericDAOManager<Long, BoardMarker> getDAOManager() {
        return boardMarkerManager;
    }

}

