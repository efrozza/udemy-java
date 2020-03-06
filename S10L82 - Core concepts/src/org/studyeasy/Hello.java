package org.studyeasy;

import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new OnePlus5();
		System.out.println("Processador" + phone.processor());
		System.out.println("Space in gb" + phone.spaceGB());
		System.out.println("OS " + phone.OS());
		

	}

}
