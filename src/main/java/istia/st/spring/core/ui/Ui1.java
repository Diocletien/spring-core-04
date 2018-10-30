package istia.st.spring.core.ui;

import istia.st.spring.core.metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 * Created by hugues on 28/10/18.
 */

@Component
public class Ui1 implements IUi {

    @Autowired
    @Qualifier("metier1")
    private IMetier metier;

    public int doSomethingInUiLayer(int a, int b) {
        a++;
        b++;
        return metier.doSomethingInMetierLayer(a, b);
    }

    public void setMetier(IMetier metier) {
        this.metier = metier;
    }

}