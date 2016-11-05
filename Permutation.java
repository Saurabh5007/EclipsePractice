package normal;

public class Permutation {

	public static int SIZE=0;
	public static int[] input={1,2,3,4,5,6};
	public static boolean[] visited;
	public static int[] output;
	public static int counter=1;
	public static void main(String[] args) {
		SIZE=input.length;
		output=new int[SIZE];
		visited=new boolean[SIZE];
		System.out.println("Total Permutation will be Factorial of "+SIZE);
		permute(0);

	}

	private static void permute(int index) {
		
		//This is the exit condition from the recursion
		if(index==SIZE)
		{
			System.out.print(counter+"--> ");
			for(int i=0;i<SIZE;i++)
			{
				System.out.print(+output[i]+" ");
				
			}
			counter++;
			System.out.println();
		}
		
		//This is the main logic for finding permutations.
		//Here index variable is used for filling the output array which is managed by recursion.
		for(int i=0;i<SIZE;i++)
		{
			if(visited[i])
			{
				continue;
			}
			visited[i]=true;
			output[index]=input[i];
			permute(index+1);
			visited[i]=false;
		}
		
		
	}

}
