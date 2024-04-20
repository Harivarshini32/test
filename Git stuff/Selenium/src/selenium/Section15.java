package selenium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section15 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ArrayList<String> name=new ArrayList<String>();
		name.add("madhu");
		name.add("varshini");
		name.add("tharani");
		name.add("tharsh");
		Long data=name.stream().filter(s->s.startsWith("m")).count();
	System.out.println(data);
	Long d=Stream.of("hari","huij","uyh","uhuih").filter(m->m.startsWith("h")).count();
	System.out.println(d);
	name.stream().forEach(l->System.out.println(l));
	name.stream().filter(n->n.length()>4).limit(2).forEach(k->System.out.println(k));
	name.stream().filter(g->g.startsWith("m")).map(u->u.toUpperCase()).forEach(m->System.out.println(m));;
	List<String> y=name.stream().filter(h->h.startsWith("t")).sorted().collect(Collectors.toList());
	System.out.println(y);
	boolean match=name.stream().anyMatch(s->s.equalsIgnoreCase("varsini"));
	System.out.println(match);
	List<Integer> order=Arrays.asList(3,3,4,4,6,7,7);
	//to print unique values
	order.stream().distinct().forEach(S->System.out.println(S));
	
	ArrayList<String> n=new ArrayList<String>();
	n.add("1ejygu");
	n.add("1e");
	n.add("1t");
	
	Long data1 = n.stream().filter(e->e.startsWith("1")).count();
	System.out.println(data1);
	
	
	n.stream().forEach(e->System.out.println(e));
	
	n.stream().filter(r->r.length()>4).map(r->r.toUpperCase()).forEach(i->System.out.println(i));
	
	List<String> f = Arrays.asList("eri","reltier");
	f.stream()args
	
	}
	

	
	
	 
}