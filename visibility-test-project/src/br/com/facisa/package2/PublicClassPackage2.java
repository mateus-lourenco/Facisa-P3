package br.com.facisa.package2;

import br.com.facisa.package1.PublicClassPackage1;

public class PublicClassPackage2 {

	DefaultClassPackage2 a;
	PublicClassPackage2 b;
	
	//DefaultClassPackage1 c;
	PublicClassPackage1 d;
	
public PublicClassPackage2(){
		
		a.defaultMethodDCP2();
		a.publicMethodDCP2();
		//a.privateMethodDCP2();
		a.protectedMethodDCP2();
		
		b.defaultMethodPCP2();
		b.publicMethodPCP2();
		b.privateMethodPCP2();
		b.protectedMethodPCP2();
		
		//d.defaultMethodPCP1();
		d.publicMethodPCP1();
		//d.privateMethodPCP1();
		//d.protectedMethodPCP1();
	}
	
	void defaultMethodPCP2(){}
	public void publicMethodPCP2(){}
	private void privateMethodPCP2(){}
	protected void protectedMethodPCP2(){}
}
