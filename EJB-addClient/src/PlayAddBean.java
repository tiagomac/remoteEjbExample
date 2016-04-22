import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejbs.AddBeanRemote;

public class PlayAddBean {

	public static void main(String[] args) throws NamingException {
		AddBeanRemote addbean = (AddBeanRemote) InitialContext.doLookup("EJB-add/AddBean!ejbs.AddBeanRemote");
		System.out.println("3 + 2 = " + addbean.add(3, 2));
		System.out.println("Very impressive!");

	}

}
