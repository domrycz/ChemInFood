package dao;

import domain.Additive;

public interface DAOInterface {
    void create(Additive additive);
    Additive read(String numberE);
    void update(Additive additive);
    void delete(String numberE);
}
