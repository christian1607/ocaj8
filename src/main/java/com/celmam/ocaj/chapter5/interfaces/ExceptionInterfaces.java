package com.celmam.ocaj.chapter5.interfaces;

public class ExceptionInterfaces implements IException {

	/* If the interface method throws a exception
	 * the class that implements is not required to 
	 * throw such a exception (It works as well as inherintance
	 * */
	@Override
	public void MyMethodFails()   {
		
		
	}

}

interface IException{
		
	void MyMethodFails() throws Exception;
}
