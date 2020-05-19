package practicePrograms;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Collections_Program {
	  
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Meraj");
		al.add("Mehar");
		al.add("Minhaj");
		System.out.println(al);
		al.remove("Meraj");
		System.out.println(al);
		
		Employee e1=new Employee("meraj",27,"QA");
		Employee e2=new Employee("Mehar",54,"Home Maker");
		Employee e3=new Employee("Minhaj",28,"Developer");
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		Iterator<Employee> it= emp.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.name);
			System.out.println(e.EmpId);
			System.out.println(e.desg);
		}
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(100, "Minhaj");
		m.put(200, "Meraj");
		m.put(300, "Mehar");
		System.out.println(m);
		
		System.out.println(m.get(200));
		
		for(Entry e:m.entrySet()) {
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		Map<Integer,Employee> m1 = new HashMap<Integer,Employee>();
		m1.put(1, e1);
		m1.put(2, e2);
		m1.put(3, e3);
		
		for(Entry e4:m1.entrySet()) {
			System.out.println(e4.getKey());
			Employee e5=(Employee) e4.getValue();
			System.out.println(e5.name+","+e5.EmpId+","+e5.desg);
			
		}
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("A","Meraj");
		ht.put("B", "Minhaj");
		ht.put("C", "Mehar");
		ht.put("D", "Meraj");
		
		Enumeration e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
