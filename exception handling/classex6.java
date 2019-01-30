class leveloneexception extends exception {}
class leveloneexception extends leveloneexception {}
class leveloneexception extends leveltwoexception {}
class A{
	void f () throws leveloneexception{
		throw new leveloneexception();

	}
}
class B extends A {
	void f() throws leveloneexception{
		throw new leveloneexception();
	}
}
class C extends B {
	void f() throws leveloneexception{
		throw new leveloneexception();
	}
}
public class ex6{
	 public static void main(String[] args) {
	A a=new C();
	try{
		a.f();
	}	catch(leveloneexception e3){
		System.out.println("caught e3");
	} catch(leveloneexception e2){
		System.out.println("caught e2");
	}catch(leveloneexception e1){
		System.out.println("caught e1");
	          }
       }
}