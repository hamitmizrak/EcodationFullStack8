package com.hamitmizrak.oop.interfacex;

import java.io.Serializable;

public class OracleDatabase implements IDatabaseCrud, Serializable {
    @Override
    public void create() {

    }

    @Override
    public String update(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public int select(Long id) {
        return 0;
    }
}

