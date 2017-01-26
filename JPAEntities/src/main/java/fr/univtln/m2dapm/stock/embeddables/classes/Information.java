package fr.univtln.m2dapm.stock.embeddables.classes;

import fr.univtln.m2dapm.stock.embeddables.interfaces.IInformation;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Maxime Gajovski on 11/12/2016.
 */

@Embeddable
public class Information implements IInformation{

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    /* - - - - - - - - - - C O N S T R U C T O R S - - - - - - - - - - */

    public Information(){

    }


    /* - - - - - - - - - - G E T T E R S - S E T T E R S  - - - - - - - - - - */


    public String getName() {
        return name;
    }

    public IInformation setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public IInformation setDescription(String description) {
        this.description = description;
        return this;
    }

    /* - - - - - - - - - - T O - S T R I N G - - - - - - - - - - */

    @Override
    public String toString() {
        return super.toString();
    }
}
