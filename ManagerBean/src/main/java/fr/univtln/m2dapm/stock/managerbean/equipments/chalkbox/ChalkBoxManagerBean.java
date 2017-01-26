package fr.univtln.m2dapm.stock.managerbean.equipments.chalkbox;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IBoardMarkerDAO;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IChalkBoxDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.BoardMarker;
import fr.univtln.m2dapm.stock.entities.classes.equipments.ChalkBox;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.boardmarker.IBoardMarkerLocal;
import fr.univtln.m2dapm.stock.managerbean.equipments.boardmarker.IBoardMarkerRemote;

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
public class ChalkBoxManagerBean extends GenericManagerBean<Long, IChalkBox, ChalkBox>
        implements IChalkBoxLocal<ChalkBox>, IChalkBoxRemote<ChalkBox> {

    @JPADAO
    @Inject
    IChalkBoxDAO chalkBoxDAO;

    @Override
    public ICrud<Long, IChalkBox> getAbstractCrud() {
        return chalkBoxDAO;
    }
}
