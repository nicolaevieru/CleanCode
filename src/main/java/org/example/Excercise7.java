package org.example;

import static org.example.Excercise7.Error.ERROR;
import static org.example.Excercise7.Error.OK;

public class Excercise7 {

    private Error deleteKey(String page) {
        if (page.contains("ceva gresit in cheie")) {
            return Error.INVALID;
        }
        if (page.contains("ceva inacesibil din cheie")) {
            return Error.LOCKED;
        }
        if (page == null) {
            return Error.NO_SUCH;
        }
        return OK;
    }

    private Error deleteReference(String page) {
        if (page.contains("ceva in alta pagina ")) {
            return Error.INVALID;
        }
        if (page.contains("ceva in alta pagina nevazuta")) {
            return Error.LOCKED;
        }
        if (page == null) {
            return Error.NO_SUCH;
        }
        return OK;
    }

    private Error deletePage(String page) {
        if (page.contains("ceva gresit")) {
            return Error.INVALID;
        }
        if (page.contains("ceva inacesibil")) {
            return Error.LOCKED;
        }
        if (page == null) {
            return Error.NO_SUCH;
        }
        return OK;
    }

    private Error doSomething(String page) {
        if (deletePage(page) == OK) {
            if (deleteReference(page) == OK) {
                if (deleteKey(page) == OK) {
                    System.out.println("page deleted");
                } else {
                    System.out.println("configKey not deleted");
                }
            } else {
                System.out.println("deleteReference from registry failed");
            }
        } else {
            System.out.println("delete failed");
            return ERROR;
        }
        return OK;
    }



    public enum Error {
        OK,
        INVALID,
        NO_SUCH,
        LOCKED,
        ERROR
    }
}
