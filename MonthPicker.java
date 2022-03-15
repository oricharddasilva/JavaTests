import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthPicker
{
	public static void main(String[] args)
	{
		Scanner i = new Scanner(System.in);
		byte b;
		final String[] MONTHS_IN_A_YEAR = {
			"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
		};

		System.out.print("Select a month number: ");
		try {
			b = i.nextByte();

			if(b <= MONTHS_IN_A_YEAR.length)
			{
				System.out.println(MONTHS_IN_A_YEAR[b] + " is the best choice to party!");
			}
			else
			{
				System.out.println("Out of range. Select a number between 1 and 12.");
			}
		}
		catch (InputMismatchException invalidDataType)
		{
			System.out.println("Only numbers are accepted.");
		}
	}
}
