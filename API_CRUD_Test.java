import java.util.Arrays;
import java.util.Collections;
import io.restassured.RestAssured;

public class API_CRUD_Test {
@Test
	void testFirstMissingNumber()
	{
		int[] arr = {4,2,1,6,8,71};
		Arrays.sort(arr);
		int count=0;
		int j=0;

		for(int i =0; i<arr.length;i++)
		{
				j++;
				if(j==arr[i])
				{
					
				}
				else
				{
					count++;
					break;
				}			
		}
		System.out.println("First missing number is:"+ j);
	}	
}
