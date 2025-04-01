package test2;

public class Airplane {
	String fno;
	String fdes;
	String fdep;
	

	public Airplane(String fno, String fdes, String fdep) {
		this.fno = fno;
		this.fdes = fdes;
		this.fdep = fdep;
	}
	void fstatus()
	{
		System.out.println(" the flight "+ fno + " to destination" + fdes + "is scheduled to depart at "+ fdep );
	}
	void fdelay(String newfdep)
	{
		fdep=newfdep;
		System.out.println(" the flight is delayed and is scheduled at "+ newfdep);
	}


	public static void main(String[] args) {
	
     Airplane ob = new Airplane("A1234","INDIA","12:34 PM");
     ob.fstatus();
     ob.fdelay("15:23 PM");
     
	}

}
