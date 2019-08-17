package heap;
import java.util.* ;

public class Sort_chars_by_frequency {
	
	public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>() ;
        for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1) ;
        }
        // List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet()) ;
        // Collections.sort(list,(o1,o2)->o2.getValue()-o1.getValue()) ;
        PriorityQueue<Map.Entry<Character,Integer>> heap=new PriorityQueue<>((o1,o2)->(o2.getValue()-o1.getValue()));
        heap.addAll(map.entrySet());
        
        StringBuilder sb=new StringBuilder();
        while(!heap.isEmpty()){
            Map.Entry<Character,Integer> entry=heap.poll();
            for(int i=1;i<=entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		String str = "tree" ;
		System.out.println(frequencySort(str)) ;
	}
}
