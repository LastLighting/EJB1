package dao;

import entities.LostSoul;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

@Local
public interface SoulDAO {
    List<LostSoul> selectAllSoul();
//    void addSoul(LostSoul lostSoul);
//    void deleteSoulById(int id);
}
