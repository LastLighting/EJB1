package beans;

import dao.ManDAOCont;
import entities.Man;
import javax.enterprise.context.Conversation;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.lang.annotation.Inherited;

/**
 * Created by aalle on 13.03.2017.
 */
@ConversationScoped
@Named
public class ManContBean implements Serializable {
    private Man man;

    @EJB
    ManDAOCont manDAOCont;

    @Inject
    Conversation conversation;



    @PostConstruct
    public void PostConstruct() {
        if(conversation.isTransient()) {
            conversation.begin();
        }
    }

    public String goToNextPage() {
        return "confirm";
    }

    public String confirm() {
        manDAOCont.addMan(man);
        conversation.end();
        return "index";
    }

    public Man getLostSoul() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
}
