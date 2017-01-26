package fr.univtln.m2dapm.stock.entities.classes.actors;

import fr.univtln.m2dapm.stock.embeddables.classes.FullName;
import fr.univtln.m2dapm.stock.embeddables.interfaces.IFullName;
import fr.univtln.m2dapm.stock.entities.classes.AbstractEntity;
import fr.univtln.m2dapm.stock.entities.interfaces.actors.ITeacher;
import fr.univtln.m2dapm.stock.embeddables.interfaces.IFullNameWrite;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Maxime Gajovski on 07/12/2016.
 */

@Entity
@Table(name ="TEACHER")
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "teacher.findAll", query = "select u from Teacher u"),
        @NamedQuery(name = "teacher.removeAll", query = "delete from Teacher u")}
)
public class Teacher extends AbstractEntity<Long> implements ITeacher{

    @Embedded
//    @Target(FullName.class)
    private FullName fullName;


    /* - - - - - - - - - - C O N S T R U C T O R S - - - - - - - - - - */

    protected Teacher(){
    }

    private Teacher(Teacher.Builder teacherBuilder){
        this.fullName = teacherBuilder.fullNameBuilder;
    }

    /* - - - - - - - - - - G E T T E R S - S E T T E R S  - - - - - - - - - - */

    @Override
    public String getFirstName() {
        return fullName.getFirstName();
    }

    @Override
    public String getLastName() {
        return fullName.getLastName();
    }

    @Override
    public IFullName setFirstName(String firstName) {
        fullName.setFirstName(firstName);
        return fullName;
    }

    @Override
    public IFullName setLastName(String lastName) {
        fullName.setFirstName(lastName);
        return fullName;
    }


    /* - - - - - - - - - - T O - S T R I N G - - - - - - - - - - */

    @Override
    public String toString() {
        return  super.toString()        + "\n" +
                fullName.toString()     + "\n";
    }


    /* - - - - - - - - - - B U I L D E R - - - - - - - - - - */

    public static class Builder implements IFullNameWrite<Builder> {

        private FullName fullNameBuilder;

        public Builder(){
            fullNameBuilder = new FullName();
        }

        @Override
        public Builder setFirstName(String firstName) {
            fullNameBuilder.setFirstName(firstName);
            return this;
        }

        @Override
        public Builder setLastName(String lastName) {
            fullNameBuilder.setLastName(lastName);
            return this;
        }

        public ITeacher build(){
            return new Teacher(this);
        }
    }

}
