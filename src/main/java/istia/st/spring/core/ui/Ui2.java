package istia.st.spring.core.ui;

import istia.st.spring.core.metier.IMetier;

/**
 * Created by hugues on 28/10/18.
 */
public class Ui2 implements IUi {

    private IMetier metier;

    public int doSomethingInUiLayer(int a, int b) {
        a--;
        b++;
        return metier.doSomethingInMetierLayer(a, b);
    }

    public void setMetier(IMetier metier) {
        this.metier = metier;
    }

}