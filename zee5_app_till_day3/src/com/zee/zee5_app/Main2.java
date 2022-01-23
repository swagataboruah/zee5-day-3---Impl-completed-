package com.zee.zee5_app;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.Exception.InvalidIdLengthException;
import com.zee.zee5_app.Exception.InvalidNameException;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Register register = new Register("ab00001", "abhinandan", "chivate", "abhi@gmail.com", "123456");
			
			System.out.println(register);
			System.out.println(register.toString());
			System.out.println("hash code "+register.hashCode());
			Register register2 = new Register("ab00001", "abhinandan", "chivate", "abhi@gmail.com", "123456");
			System.out.println(register2);
			System.out.println(register2.toString());
			System.out.println(register2.hashCode());
			System.out.println(register);
			System.out.println(register.toString());
			System.out.println("hash code "+register2.hashCode());
			System.out.println("equals method call"+register.equals(register2));
			
		} catch (InvalidIdLengthException | InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}