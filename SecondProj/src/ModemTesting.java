interface Modem {
 
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}

// ----------------------------------------------------------

class MindStickModem implements Modem {
                     public boolean open() {

                            System.out.println("Started a MindStickModem");
			    return true;

                     }

                     public boolean close() {

                             // implementation
                             System.out.println("Closed a MindStickModem");
			     return false;

                     }

                     public int read() {

                             // implementation
                             System.out.println("Reading a MindStickModem way");
			     return 100; 	

                     }

                     public int write() {

                             // implementation
                             System.out.println("Writing a MindStickModem way");
                             return 100;
 
                     }

}

//--------------------------------------------------------------------------
 class HuaweiModem implements Modem {
                     public boolean open() {

                             // implementation
			     System.out.println("Started a HuaweiModem way");
			     return true;	
                             
                     }

                     public boolean close() {

                             // implementation
                             System.out.println("Closed a HuaweiModem way");	
                             return false; 

                     }

                     public int read() {

                             // implementation
                             System.out.println("Reading a HuaweiModem way");
                             return 200;	

                     }

                     public int write() {

                             // implementation
                             System.out.println("Written a HuaweiModem way");	
		             return 200;	

                     }


}

// Testing class for modem 

public class ModemTesting {

	public static void main(String args[]) {

	Modem mindstickmodem = new MindStickModem(); //loose
	mindstickmodem.open();
	mindstickmodem.write();
	mindstickmodem.read();
	mindstickmodem.close();
 

	Modem huaweimodem = new HuaweiModem();
	huaweimodem.open();
	huaweimodem.write();
	huaweimodem.read();
	huaweimodem.close();
	
	Modem [] modems = new Modem [4]; //declare using an array
	Modems [0] = new MindStickModem();
	Modems [1] = new HuaweiModem();
	Modems [2] = new HuaweiModem();
	Modems [3] = new MindStickModem();
	
	for (Modem modem:modems) { //for each group
		System.out.println(modem.modemVersion);
		Modem.getMyName();
		modem.open();
		modem.write();
		modem.read();
		modem.close();
		
	}

	}

}  