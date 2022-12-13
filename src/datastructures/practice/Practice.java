package datastructures.practice;

import java.util.Stack;

class Queue{
	
int array[];
int n;
int front=-1;
int rear=-1;

public Queue(int size) {
	array=new int[size];
	n=size;
}
	
public void enqueue(int data) throws Exception {
	
	if((rear+1)%n==front) {
		throw new Exception("full");
	}
	
	if(front==-1) {
		front=0;
	}
	rear=(rear+1)%n;
	array[rear]=data;
	
}

public int dequeue() throws Exception {
	if(front==-1) {
		throw new Exception("empty");
	}
	
	int res=array[front];
	
	if(front==rear) {
		front=rear=-1;
	}
	else {
		front=(front+1)%n;
	}
	
	return res;
	
}



	
}


class Practice{
	
public static void main(String[] args) throws Exception {
	

	
}


}
