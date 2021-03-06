package istia.st.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import istia.st.spring.core.dao.Dao1;
import istia.st.spring.core.dao.Dao2;
import istia.st.spring.core.dao.IDao;
import istia.st.spring.core.metier.IMetier;
import istia.st.spring.core.metier.Metier1;
import istia.st.spring.core.metier.Metier2;
import istia.st.spring.core.ui.IUi;
import istia.st.spring.core.ui.Ui1;
import istia.st.spring.core.ui.Ui2;

@Configuration
@ComponentScan({ "istia.st.spring.core.ui" })
public class Config {

    // -------------- implémentation [Ui1, Metier1, Dao1]

    @Bean
    public IDao dao1() {
        return new Dao1();
    }

    @Bean
    public IMetier metier1(IDao dao1) {
        Metier1 metier = new Metier1();
        metier.setDao(dao1);
        return metier;
    }

/*
    @Bean
    public IUi ui1(IMetier metier1) {
        Ui1 ui = new Ui1();
        ui.setMetier(metier1);
        return ui;
    }
*/

    // -------------- implémentation [Ui2, Metier2, Dao2]
    @Bean
    public IDao dao2() {
        return new Dao2();
    }

    @Bean
    public IMetier metier2(IDao dao2) {
        Metier2 metier = new Metier2();
        metier.setDao(dao2);
        return metier;
    }

    @Bean
    public IUi ui2(IMetier metier2) {
        Ui2 ui = new Ui2();
        ui.setMetier(metier2);
        return ui;
    }
}