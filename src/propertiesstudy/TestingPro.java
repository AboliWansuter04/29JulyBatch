package propertiesstudy;

import mise.CommonMethodUse;

public class TestingPro
{
	

		public static void main(String[] args)
		{
			
			         String value1 =CommonMethodUse.readDataFromPropertyFile("RollNum");

					System.out.println(value1);
					String value2 =CommonMethodUse.readDataFromPropertyFile("StudentName");

					System.out.println(value2);

					System.out.println(CommonMethodUse.readDataFromPropertyFile("MobNum"));
					}

		}


