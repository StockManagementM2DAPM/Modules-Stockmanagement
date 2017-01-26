package fr.univtln.m2dapm.stock.entities.interfaces;

import java.io.Serializable;

/**
 * Created by Maxime Gajovski on 07/12/2016.
 */

public interface IAbstractEntity<K extends Serializable> {

    Long    getId();
    String  toString();
    boolean equals(Object o);
    int     hashCode();
}
