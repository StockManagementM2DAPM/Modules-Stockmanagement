package fr.univtln.m2dapm.stock.entities.classes.equipments;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IChalkBox;

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


@DiscriminatorValue("CHALK_BOX")
@NamedQueries({
        @NamedQuery(name = "chalkbox.findAll", query = "select u from ChalkBox u"),
        @NamedQuery(name = "chalkbox.removeAll", query = "delete from ChalkBox u")}
)
public class ChalkBox  extends AbstractEquipment implements IChalkBox {

    protected ChalkBox(){

    }

    private ChalkBox(ChalkBox.Builder chalkBoxBuilder){
//        this.information = chalkBoxBuilder.informationBuilder;
    }

    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */

    public static class Builder extends AbstractEquipment.Builder<IChalkBox, ChalkBox.Builder> {

        @Override
        protected ChalkBox.Builder thisObject() {
            return this;
        }

        public IChalkBox build() {
            return new ChalkBox(this);
        }

    }

}
