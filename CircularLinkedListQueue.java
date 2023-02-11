package queue;

public class CircularLinkedListQueue {

    private Queue Queue;

    private class Node{
        public int data;
        public Node link;
        public Node(int data){
            this.data = data;
        }
    }

    private class Queue{
        public Node front = null;
        public Node rear = null;
        public Queue(){
            front = rear;
        }
    }

    public void enQueue(int data){
        Node newNode = new Node(data);

        if (Queue.rear == null) {
            Queue.front = newNode;
            Queue.rear = newNode;
            Queue.rear.link = Queue.front;
        } else {
            Queue.rear.link = newNode;
            Queue.rear = newNode;
            Queue.rear.link = Queue.front;
        }
    }

    public void deQueue(){
        if(Queue.front == null){
            System.out.println("null");
        }else {
            if(Queue.front == Queue.rear){
                Queue.front = null;
                Queue.rear = null;
            }else {
                Queue.front = Queue.front.link;
                Queue.rear.link=Queue.front;
            }
        }
    }





}
