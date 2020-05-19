package com.leetcode;

import java.util.Stack;

public class StockSpannerSol {

	public static void main(String[] args) {
		int []arr= {100, 80, 60, 70, 60, 75, 85};
		StockSpanner2 stockSpanner=new StockSpanner2();
		for(int i=0;i<arr.length;i++) {
			int param1=stockSpanner.next(arr[i]);
			System.out.println(param1);
		}	
	}

}
class StockSpanner{
	private Stack<Integer> prices;
	private Stack<Integer> spans;
	public StockSpanner() {
		prices=new Stack<Integer>();
		spans=new Stack<Integer>();
	}
	public int next(int price) {
		int span=1;
		while(!prices.isEmpty() && prices.peek()<=price) {
			prices.pop();
			span+=spans.pop();	
		}
		prices.push(price);
		spans.push(span);
		return span;
	}
	
}

class StockSpanner2{
	Stack<Node> stock;
	public StockSpanner2() {
		stock=new Stack<Node>();
	}
	public int next(int price) {
		int span=1;
		while(!stock.isEmpty() && stock.peek().price<=price) {
			span+=stock.pop().span;
		}
		stock.push(new Node(price,span));
		return span;
	}
}

class Node{
	int price;
	int span;
	public Node(int price,int span) {
		this.price=price;
		this.span=span;
	}
}


