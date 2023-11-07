package com.itFactory.proiect.dao;

import com.itFactory.proiect.model.Curs;

public interface CursDao {

    void adaugaCurs(Curs curs);

    void cautaCurs(String numeCurs);

}
