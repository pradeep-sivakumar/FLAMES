import java.util.*;
public class Flames {

	public static void main(String[] args) {
		System.out.println("Enter your name : ");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine(); String a = name;
			   name = name.toLowerCase().replaceAll(" ","");
		
		System.out.println("Enter your crush name : ");
		String crushName = sc.nextLine(); String b = crushName;
			   crushName = crushName.toLowerCase().replaceAll(" ","");
		
		ArrayList<Character> ts = new ArrayList<>();

		int state = 0;
		
		char[] n1 = name.toCharArray();
		char[] n2 = crushName.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			for(int j=0;j<crushName.length();j++) {
				if(n1[i]==n2[j]) {
					n1[i] = '-';
					n2[j] = '-';
					break;
				}
			}
		}
		
		for(char x:n1) {
			if(x!='-') {
				ts.add(x);
			}
		}
		
		for(char x:n2) {
			if(x!='-') {
				ts.add(x);
			}
		}
		
		System.out.println("\n----------------------------------------------------\n");
		
		int count = ts.size();
		
		ArrayList<Character> al = new ArrayList<>();
		
		char []flames = {'F','L','A','M','E','S'};
		
		for(char x:flames)
			al.add(x);
			
		while(al.size()>1) {
			
			ArrayList<Character> test = new ArrayList<>();
			
			int index = state;
			
			for(int i=0;i<count;i++) { 
				
				if((index)==al.size()) {
					index = 0;
				}
				test.add(al.get(index++));
			}
			
		
			for(int m=0;m<al.size();m++) {
				if(test.get(count-1)==al.get(m)) {
					al.remove(m);
					state = m; break;
				}
			}
		}
		
		char result = al.get(0);
		
		switch(result) {
		
		case 'F' : System.out.println(a + " and " + b + " will be friends.");	break;
		
		case 'L' : System.out.println(a + " and " + b + " will love eachother.");	break;
		
		case 'A' : System.out.println(a + " and " + b + " will get affection.");	break;
		
		case 'M' : System.out.println(a + " and " + b + " will get married.");	break;
		
		case 'E' : System.out.println(a + " and " + b + " will be enemies");	break;
		
		case 'S' : System.out.println(a + " and " + b + " are siblings.");	break;
		}
	}

}
