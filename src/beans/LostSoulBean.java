package beans;

import dao.SoulDAO;
import dao.SoulDAOImpl;
import entities.LostSoul;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class LostSoulBean {

    @EJB
    SoulDAOImpl soulDAO;

    public List<LostSoul> getListOfLostSoul() {
        return soulDAO.selectAllSoul();
    }
}
