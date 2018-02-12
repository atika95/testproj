
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		int first = 1 ;
		int second = 2 ;
		int third = 3 ;
		String fourth = "c";
		String fifth = "c";
		String sixth = new String "c";
		
		if(fourth == fifth)
			System.out.println("fourth and fifth is same : " + fourth);
		else
			System.out.println("fourth and fifth are not same :");
		
		if(fourth == sixth)
			System.out.println("fourth and sixth is same :");
		else
			System.out.println("fourth and sixth are not same :" + fourth);
		*/
		/*
		System.out.println("Now fourth is:" + fourth);
		
		fourth = third + fourth;
		System.out.println("Now fourth is:" + fourth);
		
		fourth = third + fourth;
		System.out.println("Now fourth is:" + fourth);
		
		fourth = (String.valueOf(fi
		System.out.println("Now fourth is:" + fourth);
		*/
		
		/*
		String sms = "Selamat Datang ke Malaysia!!";
		System.out.println("SMS Size is :" + sms.length());
		System.out.println("Text at 10th position / 9th index :" + sms.charAt(9));
		System.out.println("Index of the text ! :" + sms.indexOf("!"));
		System.out.println("Substring of 0 - 10 :" + sms.substring(0,10));
		System.out.println("lower :" + sms.toLowerCase());
		System.out.println("lower :" + sms.toUpperCase());
		*/
		String country = "Malaysia";
		
		if (country.equals(args[0])) { 
			System.out.println("Country is Malaysia " + args[0]);
		} else {
			System.out.println("Country is Malaysia but " + args[0]);
			
		}
		
		String usercountry = args[0];
		
		if (usercountry.startsWith("M")) { 
			System.out.println("Country is Starting with m ");
		}
			System.out.println("Country is ending with a " );
				

		}

	}
