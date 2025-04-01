package test2;

 class Dog 
{
 String breed;
 String name;
 
	public Dog(String breed, String name) {
	this.breed = breed;
	this.name = name;
	}
	void dispaly()
	{
	System.out.println(name + " " + breed);	
	System.out.println(" ");
	}
	void set(String name , String breed)
	{
	this.breed = breed;
	this.name = name;
		
	}


	public static void main(String[] args) {
		Dog ob = new Dog("chintu" , "PITBULL");
		ob.dispaly();
	    ob.set("CYANA" , "RETRIEVER");
	    ob.dispaly();
	}

}
