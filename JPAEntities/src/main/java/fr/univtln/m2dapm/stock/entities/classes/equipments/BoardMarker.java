package fr.univtln.m2dapm.stock.entities.classes.equipments;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.IBoardMarker;

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

@DiscriminatorValue("BOARD_MARKER")
@NamedQueries({
        @NamedQuery(name = "boardmarker.findAll", query = "select u from BoardMarker u"),
        @NamedQuery(name = "boardmarker.removeAll", query = "delete from BoardMarker u")}
)
public class BoardMarker extends AbstractEquipment implements IBoardMarker {


    protected BoardMarker(){

    }

    private BoardMarker(BoardMarker.Builder boardMarkerBuilder){
        this.information = boardMarkerBuilder.informationBuilder;
    }

    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */

    public static class Builder extends AbstractEquipment.Builder<IBoardMarker, BoardMarker.Builder> {

        @Override
        protected Builder thisObject() {
            return this;
        }

        public IBoardMarker build() {
            return new BoardMarker(this);
        }

    }

}
