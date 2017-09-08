package br.com.facisa.package1;

import br.com.facisa.package2.PublicClassPackage2;

public class PublicClassPackage1 {

	DefaultClassPackage1 a;
	PublicClassPackage1 b;
	
	//DefaultClassPackage2 c;
	PublicClassPackage2 d;
	
public PublicClassPackage1(){
		
		a.defaultMethodDCP1();
		a.publicMethodDCP1();
		//a.privateMethodDCP1();
		a.protectedMethodDCP1();
		
		b.defaultMethodPCP1();
		b.publicMethodPCP1();
		b.privateMethodPCP1();
		b.protectedMethodPCP1();
		
		//d.defaultMethodPCP2();
		d.publicMethodPCP2();
		//d.privateMethodPCP2();
		//d.protectedMethodPCP2();
	}
	
	void defaultMethodPCP1(){}
	public void publicMethodPCP1(){}
	private void privateMethodPCP1(){}
	protected void protectedMethodPCP1(){}
}
