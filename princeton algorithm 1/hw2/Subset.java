
public class Subset {

	public static void main(String[] args){
		RandomizedQueue<String> q = new RandomizedQueue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			 q.enqueue(item);
		}
		int loop = Integer.parseInt(args[0]);
		for (int i =0; i<loop;++i){
			StdOut.println(q.dequeue());
		}
	
	}


}
