package com.hamitmizrak.oop.interfacex;

public interface IDatabaseCrud {
    public void create();
    public String update(Long id);
    public void delete(Long id);
    public int select(Long id);
}
