import java.util.*;
class SC { 
public static void main(String args[]){ 
	Scanner str = new Scanner(System.in);
     String a="";
	String s="";
     System.out.println("\n\t\t Welcome TO String Cryptography System\n");
     System.out.println("\n Enter a String");
     a=str.nextLine();
     int n=a.length();
	System.out.println("\n 1. PitLatin code language\n 2. Reverse PitLatin code language\n 3. Key Method");
	System.out.println("\n Enter the choice = ");
	int m = str.nextInt();

	switch(m) {
	case 1 :
         	for(int i=0;i<n;++i){ 
			char ch=a.charAt(i);
          	if(ch=='a'|| ch=='e'||ch==i||ch=='o'||ch=='u'){
				s=a.substring(0,i+1);
          		a=a.substring(i+1,n);
          		break;
         		}
     	}
		System.out.println("Encrypted value = ");
          System.out.println(a+s+"ay");
		break;

	case 2 :
          	for(int i=0;i<n;++i){ 
			char ch=a.charAt(i);
          	if(ch!='a'|| ch!='e'||ch!=i||ch!='o'||ch!='u'){
				s=a.substring(0,i+1);
          		a=a.substring(i+1,n);
          		break;
         		}
     	}
		System.out.println("Encrypted value = ");
         	System.out.println(a+s+"yz");
		break;

	case 3 :
		int i;
		System.out.println("\n Enter the Key = ");
		int key = str.nextInt();
		System.out.println("Encrypted value = ");
    		for(i=0;i<n;++i){
        		char pass = a.charAt(i);
			int tmp = (int)pass - key;
			char pass1 = (char)tmp;
			System.out.print(pass1);
    		}
		break;
	}    
  }
}  
