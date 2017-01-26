package fr.univtln.m2dapm.stock.dao.exceptions;

/**
 * Created by bruno on 04/12/14.
 */
public class DAOException extends Exception {
    private final Exception exception;

    public DAOException(Exception e) {
        this.exception = e;
    }
}