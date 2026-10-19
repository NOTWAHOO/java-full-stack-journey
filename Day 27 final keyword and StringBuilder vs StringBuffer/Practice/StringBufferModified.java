
public class StringBufferModified {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Stephen "); 	//StringBuilder --> mutable
		
		for(int i = 1; i < 10 ; i++)
		{
		sb.append("Sabar" +i);
		}
		System.out.println(sb);

	}

}
