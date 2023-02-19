package Demo;

class Dupli{
	String a="ppromila";
	int count=0;
	char[] ar2= new char[a.length()];
	
	void charArray() {
		char[] ar= a.toCharArray();
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					break;
				}
				}
			if(i==j) {
				ar2[i]=ar[i];
			}
			}		
		for(int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+" ");
	}	
}
}
public class P1 {
	public static void main(String[] args) {
	Dupli n = new Dupli();
		n.charArray();
		}
}