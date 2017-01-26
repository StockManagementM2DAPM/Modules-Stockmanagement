package fr.univtln.m2dapm.stock.entities.classes.equipments;

import fr.univtln.m2dapm.stock.entities.interfaces.equipments.ISlideProjector;

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


@DiscriminatorValue("SLIDE_ROJECTOR")
@NamedQueries({
        @NamedQuery(name = "slideprojector.findAll", query = "select u from SlideProjector u"),
        @NamedQuery(name = "slideprojector.removeAll", query = "delete from SlideProjector u")}
)
public class SlideProjector extends AbstractEquipment implements ISlideProjector {

    protected SlideProjector (){

    }

    private SlideProjector(SlideProjector.Builder slideProjectorBuilder){
        this.information = slideProjectorBuilder.informationBuilder;
    }

    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */

    public static class Builder extends AbstractEquipment.Builder<ISlideProjector,SlideProjector.Builder> {

        @Override
        protected SlideProjector.Builder thisObject() {
            return this;
        }

        public ISlideProjector build() {
            return new SlideProjector(this);
        }

    }
}
