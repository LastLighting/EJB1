package dao;

import entities.Man;

import javax.ejb.Local;

/**
 * Created by aalle on 13.03.2017.
 */
@Local
public interface ManDAOCont {
    void addMan(Man man);
    void deleteMan(int id);
}
