package array;

class Array
{
	public static void main (String[] args)
	{
	int[] list = new int[5];
	for (int index = 0; index <= 4; index++) list[index] = index * 2;
	for (int index = 4; index >= 0; index--) System.out.println(list[index]);
	}
} 