interface Modem {

  public String modemVersion = "V1"; //why we changing this?
  public boolean open();                               
  public boolean close();
  public int read ();
  //public int write(byte[] buffer);

  public static String MyName() {
	  return "Modem" ;
  }
  
}
 