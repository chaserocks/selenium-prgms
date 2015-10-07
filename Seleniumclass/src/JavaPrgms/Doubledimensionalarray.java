package JavaPrgms;

public class Doubledimensionalarray {

	public static void main(String[] args) {
			String[][] str=new String[2][3]; //for the use of multiple data types use Object instead String.
			str[0][0]="Selenium";
			str[0][1]="qtp";
			str[0][2]="Hadoop";
			
			str[1][0]="Salesforce";
			str[1][1]="Jmeter";
			str[1][2]="SAP";
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<str[i].length;j++)
				{
					System.out.print(str[i][j]+"   ");
				}
				System.out.println();
			}
	}

}
