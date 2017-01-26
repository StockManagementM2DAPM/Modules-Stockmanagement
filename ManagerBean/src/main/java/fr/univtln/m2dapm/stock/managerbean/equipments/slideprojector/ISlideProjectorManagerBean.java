package fr.univtln.m2dapm.stock.managerbean.equipments.slideprojector;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IComputerDAO;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.ISlideProjectorDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.classes.equipments.SlideProjector;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.ISlideProjector;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerLocal;
import fr.univtln.m2dapm.stock.managerbean.equipments.computer.IComputerRemote;

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
public class ISlideProjectorManagerBean extends GenericManagerBean<Long, ISlideProjector, SlideProjector>
        implements ISlideProjectorLocal<SlideProjector>, ISlideProjectorRemote<SlideProjector> {

    @JPADAO
    @Inject
    ISlideProjectorDAO slideProjectorDAO;

    @Override
    public ICrud<Long, ISlideProjector> getAbstractCrud() {
        return slideProjectorDAO;
    }
}
