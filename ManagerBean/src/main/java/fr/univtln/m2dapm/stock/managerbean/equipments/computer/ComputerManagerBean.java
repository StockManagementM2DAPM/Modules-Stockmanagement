package fr.univtln.m2dapm.stock.managerbean.equipments.computer;

import fr.univtln.m2dapm.stock.dao.JPADAO;
import fr.univtln.m2dapm.stock.dao.interfaces.ICrud;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IChalkBoxDAO;
import fr.univtln.m2dapm.stock.dao.interfaces.equipments.IComputerDAO;
import fr.univtln.m2dapm.stock.entities.classes.equipments.ChalkBox;
import fr.univtln.m2dapm.stock.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;
import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;
import fr.univtln.m2dapm.stock.managerbean.GenericManagerBean;
import fr.univtln.m2dapm.stock.managerbean.ManagerBean;
import fr.univtln.m2dapm.stock.managerbean.equipments.chalkbox.IChalkBoxLocal;
import fr.univtln.m2dapm.stock.managerbean.equipments.chalkbox.IChalkBoxRemote;

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
public class ComputerManagerBean extends GenericManagerBean<Long, IComputer, Computer>
        implements IComputerRemote<Computer>, IComputerLocal<Computer> {

    @JPADAO
    @Inject
    IComputerDAO computerDAO;

    @Override
    public ICrud<Long, IComputer> getAbstractCrud() {
        return computerDAO;
    }
}
