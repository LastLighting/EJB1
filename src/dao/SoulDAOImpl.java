package dao;

import entities.LostSoul;

import javax.ejb.Stateless;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class SoulDAOImpl extends DAO implements SoulDAO {
    private final String selectAllSoul = "select idlostsoul, name, causeOfDeath, dateOfDeath, lifeEvents, age  from lostsoul";

    @Override
    public List<LostSoul> selectAllSoul() {
        toConnection();
        List<LostSoul> lostSouls = new ArrayList<LostSoul>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectAllSoul);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                LostSoul lostSoul = new LostSoul();
                lostSoul.setIdSoul(resultSet.getInt("idlostsoul"));
                lostSoul.setName(resultSet.getString("name"));
                lostSoul.setCouseOfDeath(resultSet.getString("causeOfDeath"));
                lostSoul.setDateOfDeath(resultSet.getDate("dateOfDeath"));
                lostSoul.setAge(resultSet.getInt("age"));
                lostSouls.add(lostSoul);
            }
        }
        catch (SQLException sqlException) {

        }
        finally {
            closeConnection();
        }
        return lostSouls;
    }
}
