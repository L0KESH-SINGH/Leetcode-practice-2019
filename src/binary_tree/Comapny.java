package binary_tree;



class rajat {
	public int number;
}
class Company{
	
	public void play(int i,rajat p) {
		i=5;
		p.number=8;
	}
	public static void main(String[] args) {
		int x=0;
		rajat p=new rajat();
		new Company().play(x, p);
		System.out.println(x+" "+p.number);
		

	}
}


	


