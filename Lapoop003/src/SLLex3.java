public class SLLex3 {
private class Node {
private int element;
private Node next;

// constructor
public Node(int data) {
element = data;
next = null;
}

// link a new node to this node
public void link(Node newNode) {
next = newNode;
}

// return next node
public Node getNextNode() {
return next;
}

// return element of this node
public int getElement() {
return element;
}
}
// --------------------- End Node --------------------

// SLL properties and methods
private Node head = null;
private Node tail = null;
private int size = 0; // SLL's size

public void addLast(int data) {
// create new node
Node newNode = new Node(data);
if (size == 0) {
head = newNode;
} else {
tail.link(newNode);
}
tail = newNode;
size++;
}

public void addFirst(int data) {
Node newNode = new Node(data);
if(size==0) {
head=newNode;
tail=newNode;
size++;
}else {
newNode.link(head);
head=newNode;
size++;
}
}

public void removeFirst() {
if(size==1) {
head=null;
tail=null;
//size--;
}else {
head=head.getNextNode();
//size--;
}
size--;
}

public void removeLast() {
if(size==1) {
head=null;
tail=null;
//size--;
}else if(size>1 ) {
Node p=head;
while(p.getNextNode()!=tail) {
p=p.getNextNode();
}
tail=p;
tail.link(null);
size--;
}
}


public void print() {
if (size == 0) {
System.out.println("Empty linked list");
} else {
for (Node p = head; p != null; p = p.getNextNode()) {
System.out.print(p.getElement() + "->");
}
System.out.println("null");
}
}
public boolean findElement(int element) {//to find whether a number is in a SLL and return true or false when found and not found respectively
for(Node pointer = head ; pointer != null ;pointer = pointer.getNextNode())
        {
            if (pointer.getElement() == element) {
            return true;
            }
}

return false;
}

public int countElement(int element) {//to count nodes whose elements are equal to a number
int sum = 0;

for(Node pointer = head ; pointer != null ;pointer = pointer.getNextNode())
        {
            if (pointer.getElement() == element) {
            sum++;
            }
}

return sum;
}
public int sumElement() {//to find summation of all numeric elements of nodes
int sum = 0;

for(Node pointer = head ; pointer != null ;pointer = pointer.getNextNode())
        {
            sum += pointer.getElement();
}
return sum;
}
}

