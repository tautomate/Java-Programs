package occurences;

public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		char p[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
			//char p[]=s.toCharArray();
			for(int j=i+1;j<s.length();j++) {
				if(p[i]==p[j]) {
					count++;
					//System.out.println(p[j]);
				}
				
			}
			}
		System.out.println(count);
				

	}

}
