package fr.univtln.m2dapm.stock.managerbean.equipments.boardmarker;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IBoardMarkerDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.BoardMarker;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Maxime Gajovski on 26/01/2017.
 */

@Stateless
@ManagerBean
@Local
//@Local(IClassroomLocal.class)
//@Remote(IClassroomRemote.class)
public class BoardMarkerManagerBean extends GenericManagerBean<Long, IBoardMarker, BoardMarker>
        implements IBoardMarkerLocal<BoardMarker>, IBoardMarkerRemote<BoardMarker> {

    @JPADAO
    @Inject
    IBoardMarkerDAO boardMarkerDAO;

    @Override
    public ICrud<Long, IBoardMarker> getAbstractCrud() {
        return boardMarkerDAO;
    }
}
