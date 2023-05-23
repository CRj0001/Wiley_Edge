package Data_structures;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeBottomView {

	public static void printBottomView(TreeNodeOne root) {
		
		if(root == null) {
			return;
		}
		
		Map<Integer,Integer> map = new TreeMap<>();
		Queue<QueueNode> q = new LinkedList<>();
		
		q.add(new QueueNode(root, 0));
		
		while(!q.isEmpty()) {
			
			QueueNode curr = q.poll();
		
			map.put(curr.view,curr.node.val);
			
			if(curr.node.left != null) {
				q.add(new QueueNode(curr.node.left, curr.view-1));
			}
			
			if(curr.node.right != null) {
				q.add(new QueueNode(curr.node.right, curr.view+1));
			}
		}
		for(int val : map.values()) 
		{
			System.out.print(val + "->");
		}
			
		}
		
		 public static void main(String[] args) {
			 
		        TreeNodeOne root = new TreeNodeOne(4);
		        root.left = new TreeNodeOne(34);
		        root.right = new TreeNodeOne(33);
		        root.left.right = new TreeNodeOne(44);
		        root.right.right = new TreeNodeOne(52);
		        root.left.right.right = new TreeNodeOne(16);
		        root.left.right.left = new TreeNodeOne(8);

		        System.out.println("Bottom view of the binary tree:");
		        printBottomView(root);
		    } 
	
	
	

	
}
