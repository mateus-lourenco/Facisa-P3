package br.com.facisa.package2;

import br.com.facisa.package1.PublicClassPackage1;

class DefaultClassPackage2 {

	DefaultClassPackage2 a;
	PublicClassPackage2 b;
	
	//DefaultClassPackage1 c;
	PublicClassPackage1 d;
	
public DefaultClassPackage2(){
		
		a.defaultMethodDCP2();
		a.publicMethodDCP2();
		a.privateMethodDCP2();
		a.protectedMethodDCP2();
		
		b.defaultMethodPCP2();
		b.publicMethodPCP2();
		//b.privateMethodPCP2();
		b.protectedMethodPCP2();
		
		//d.defaultMethodPCP1();
		d.publicMethodPCP1();
		//d.privateMethodPCP1();
		//d.protectedMethodPCP1();
	}

	
	void defaultMethodDCP2(){}
	public void publicMethodDCP2(){}
	private void privateMethodDCP2(){}
	protected void protectedMethodDCP2(){}
}
