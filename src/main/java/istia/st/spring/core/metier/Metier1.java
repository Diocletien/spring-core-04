package istia.st.spring.core.metier;

/**
 * Created by hugues on 28/10/18.
 */
import istia.st.spring.core.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Metier1 implements IMetier {

    private IDao dao;

    public int doSomethingInMetierLayer(int a, int b) {
        a++;
        b++;
        return dao.doSomethingInDaoLayer(a, b);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}