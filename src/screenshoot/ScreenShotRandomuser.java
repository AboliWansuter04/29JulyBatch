package screenshoot;

import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class ScreenShotRandomuser {

	public static void main(String[] args) 
	{
		RandomString rs=new RandomString();
		System.out.println(rs.make(4));
		Date d=new Date();
		System.out.println(d);
	}

}
