package DFSBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;


public class Main {
	
	public static class Queue<T>{
		class Node<T>{
			private T data;
			private Node<T> next;
			
			public Node(T data) {
				this.data = data;
			}
		}
		
		private Node<T> first;
		private Node<T> last;
		
		public void add(T item){
			Node<T> t = new Node<T>(item);
			
			if(last != null) {
				last.next = t;
			}
			last = t;
			
			if(first == null) {
				first = last;
			}
		}
		
		public T remove(){
			if(first == null) {
				throw new NoSuchElementException();
			}
			
			T data = first.data;
			first = first.next;
			
			if(first == null) {
				last = null;
			}
			return data;
		}
		
		public T peek() {
			if(first == null) {
				throw new NoSuchElementException();
			}
			return first.data;
		}
		
		public boolean isEmpty() {
			return first == null;
		}
	}

	public static class Graph{
		class Node{
			int data;
			LinkedList<Node> adjacent;
			boolean marked;
			
			Node (int data){
				this.data = data;
				this.marked = false;
				adjacent = new LinkedList<Node>();
			}
		}
		
		Node[] nodes;
		
		Graph(int size) {
			nodes = new Node[size];
			for(int i = 0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}
		
		void addEdge(int i1, int i2) {
			Node n1 = nodes[i1];
			Node n2 = nodes[i2];
			
			if(!n1.adjacent.contains(n2)) {
				n1.adjacent.add(n2);
			}
			if(!n2.adjacent.contains(n1)) {
				n2.adjacent.add(n1);
			}
		}
		
		void dfs() {
			dfs(0);
		}
		
		void dfs(int index) {
			Node root = nodes[index];
			Stack<Node> stack = new Stack<Node>();
			stack.push(root);
			root.marked = true;
			
			while(!stack.isEmpty()) {
				Node r = stack.pop();
				for(Node n : r.adjacent) {
					if(n.marked == false) {
						n.marked = true;
						stack.push(n);
					}
				}
				visit(r);
			}
		}
		
		void bfs() {
			bfs(0);
		}
		
		void bfs(int index) {
			Node root = nodes[index];
			Queue<Node> queue = new Queue<Node>();
			queue.add(root);
			root.marked = true;
			
			while(!queue.isEmpty()) {
				Node r = queue.remove();
				for(Node n : r.adjacent) {
					if(n.marked == false) {
						n.marked = true;
						queue.add(n);
					}
				}
				visit(r);
			}
		}
		
		void dfsR(Node r) {
			if(r == null) return;
			
			r.marked = true;
			visit(r);
			
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					dfsR(n);
				}
			}
		}
		
		void dfsR(int index) {
			Node r = nodes[index];
			dfsR(r);
		}
		
		void dfsR() {
			dfsR(0);
		}
		
		void visit(Node n) {
			System.out.print(n.data + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int comCount = Integer.parseInt(br.readLine());
		int connectedCount = Integer.parseInt(br.readLine());
		
		
		Graph g = new Graph(comCount);
		
		
		for(int i = 0; i < connectedCount; i++) {
			String[] str = (br.readLine()).split(" ");
			g.addEdge(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}
		
		
		g.dfs();
		
//			bw.write(result);			
		
//			bw.flush();

			br.close();
	}

}
