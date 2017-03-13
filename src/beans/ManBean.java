package beans;

import dao.ManDAOImpl;

import entities.Man;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class ManBean {

    @EJB
    ManDAOImpl manDAO;

    public List<Man> getListMans() {
        return manDAO.selectAllMan();
    }
}
