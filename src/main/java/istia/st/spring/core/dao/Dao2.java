package istia.st.spring.core.dao;

/**
 * Created by hugues on 28/10/18.
 */
public class Dao2 implements IDao {

    public int doSomethingInDaoLayer(int a, int b) {
        return a-b;
    }

}