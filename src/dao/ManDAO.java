package dao;

import entities.Man;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ManDAO {
    List<Man> selectAllMan();
//    void addSoul(LostSoul lostSoul);
//    void deleteSoulById(int id);
}
