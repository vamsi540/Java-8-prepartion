package TypeCastingandWrapperClassandthreads;

public class ThreadDemo {
	public static void main(String[] args) {

	Mythread t1=new Mythread();
	t1.start();
	MyRunnable r1=new MyRunnable();
	Thread t2=new Thread(r1);
	t2.start();
	
	//crud 
	//restcontroller
	// get,post,delete,put  
	//write the methods 
	//controller to service
	//serice to reposistory
	//status codes-100,200,300,400,500
	//204 - success and but we are not sending the data(no content)
	
	
	//
	
	
}
}