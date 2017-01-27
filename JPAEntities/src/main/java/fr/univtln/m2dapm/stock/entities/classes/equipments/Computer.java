package fr.univtln.m2dapm.stock.entities.classes.equipments;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IComputer;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Maxime Gajovski on 07/12/2016.
 */

@Entity

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)


@DiscriminatorValue("COMPUTER")
@NamedQueries({
        @NamedQuery(name = "computer.findAll", query = "select u from Computer u"),
        @NamedQuery(name = "computer.removeAll", query = "delete from Computer u")}
)
public class Computer extends AbstractEquipment implements IComputer {


    protected Computer(){

    }

    private Computer(Computer.Builder computerBuilder){
//        this.information = computerBuilder.informationBuilder;
    }

    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */

    public static class Builder extends AbstractEquipment.Builder<IComputer, Computer.Builder> {

        @Override
        protected Computer.Builder thisObject() {
            return this;
        }

        public IComputer build() {
            return new Computer(this);
        }

    }

}
