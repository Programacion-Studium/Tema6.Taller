package es.Studium;

public class NegativeArray {
		public static void main (String args[])
		{
			int i = -1;
			String vectorS [] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3"};
			while (i < 3 )
			{
				try
				{
					System.out.println(vectorS[i]);
				}
				catch(NegativeArraySizeException e)
				{
					Error err = new Error(e);
					System.out.println("Se ha producido el error: " + err);
				}
				i++;
			}
		}
	}
