class IfElseLadder {
   public static void main(String[] args) { //else common for zero or negative  

      //int number = 0;
     int number = Integer. parseInt(args[0]);
     
	 System.out.println("This is the number" + number);
	 
      if (number > 0) {
         System.out.println("Number is positive.");
         
      }
      else if (number < 0) {
         System.out.println("Number is negative.");
         
      }
      else {
         System.out.println("Number is 0.");
         
      } 
   }
}