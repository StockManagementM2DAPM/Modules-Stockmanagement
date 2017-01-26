package fr.univtln.m2dapm.stock.entities.classes.premises;

import fr.univtln.m2dapm.stock.embeddables.classes.Information;
import fr.univtln.m2dapm.stock.embeddables.interfaces.IInformation;
import fr.univtln.m2dapm.stock.embeddables.interfaces.IInformationRead;
import fr.univtln.m2dapm.stock.embeddables.interfaces.IInformationWrite;
import fr.univtln.m2dapm.stock.entities.classes.AbstractEntity;
import fr.univtln.m2dapm.stock.entities.interfaces.premises.IClassRoom;

import org.hibernate.annotations.Target;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Maxime Gajovski on 11/12/2016.
 */

@Entity
@Table(name = "CLASSROOM")
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "classroom.findAll", query = "select u from ClassRoom u"),
        @NamedQuery(name = "classroom.removeAll", query = "delete from ClassRoom u")}
)
public class ClassRoom extends AbstractEntity<Long> implements IClassRoom {


    @Embedded
    @Target(Information.class)
    private Information information;


    /* - - - - - - - - - - C O N S T R U C T O R S - - - - - - - - - - */

    protected ClassRoom(){

    }

    private ClassRoom(ClassRoom.Builder classroomBuilder){
        this.information = classroomBuilder.informationBuilder;
    }


    /* - - - - - - - - - - G E T T E R S - S E T T E R S  - - - - - - - - - - */

    @Override
    public IInformationRead getInformation() {
        return information;
    }


    /* - - - - - - - - - - T O - S T R I N G - - - - - - - - - - */

    @Override
    public String toString() {
        return  super.toString()        + "\n" +
                information.toString()     + "\n";
    }

    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */


    public static class Builder implements IInformationWrite<Builder> {

        private Information informationBuilder;

        public Builder(){
            informationBuilder = new Information();
        }

        @Override
        public Builder setName(String name) {
            informationBuilder.setName(name);
            return this;
        }

        @Override
        public Builder setDescription(String description) {
            informationBuilder.setDescription(description);
            return this;
        }

        public IClassRoom build(){
            return new ClassRoom(this);
        }

    }
}
