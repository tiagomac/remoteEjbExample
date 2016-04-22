package ejbs;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AddBean
 */
@Stateless
public class AddBean implements AddBeanRemote {

    /**
     * Default constructor. 
     */
    public AddBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
