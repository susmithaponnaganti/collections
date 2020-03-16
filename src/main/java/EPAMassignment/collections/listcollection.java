package EPAMassignment.collections;

import java.util.*;
import java.util.ArrayList;

public class listcollection {

static int fetch(ArrayList<Integer> a,int t) {
return a.get(t);
}
static void add(ArrayList<Integer> a,int t) {
a.add(t);
}
static void delete(ArrayList<Integer> a,int t) {
a.remove(new Integer(t));
}

public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer>ar=new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
		ar.add(i);
	}
	System.out.println("Enter n.o of options");
	int q=sc.nextInt();
	while(q-- != 0) {
		System.out.println("Enter ur option");
		String s1 = sc.next();
		System.out.println(s1+" ");
		if(s1.equals("Fetch")) {
			System.out.println("Enter valid index");
			int t=sc.nextInt();
			System.out.println(fetch(ar,t));
		}
		else if(s1.equals("adding")) {
			System.out.println("Enter a number");
			int x=sc.nextInt();
			add(ar,x);
		}
		else if(s1.equals("delete")) {
			System.out.println("Enter a number");
			int y=sc.nextInt();
			delete(ar,y);
		}
		else if(s1.equals("print")){
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i));
			}
		}
	}
	}
}
