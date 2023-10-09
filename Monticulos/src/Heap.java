import java.util.Comparator;
import java.util.Iterator;



public class Heap<E> implements HeapInterface<E> {

    
    
    // Returns the index of the parent
    // of the element at ith index.
    private int parent (int i){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Returns the index of the left child.
    private int leftChild(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    // Returns the index of the
    // right child.
    private int rightChild(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //siftUp
    //move a node up in the tree, as long as needed; used to restore heap condition after insertion.
    private void siftUp(int i){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //siftDown
    //move a node down in the tree, similar to sift-up; used to restore heap condition after deletion or replacement.
    private void siftDown(int i){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Heap(Comparator<E> c){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Heap(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<? super E> comparator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    @Override 
    public E peak(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


/*       // To String method with debugging purposes
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < heap.size(); i++) {
            sb.append(heap.get(i));
            if (i < heap.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    *
     * Checks if the heap property is valid for all nodes.
     *
     * @return True if the heap property is valid for all nodes, false otherwise.

    public boolean isHeap() {
        return isHeap(0);
    }

    *
     * Checks if the heap property is valid for the node at the given index and all its descendants.
     *
     * @param i The index of the node to check.
     * @return True if the heap property is valid for the node at the given index and all its descendants, false otherwise.

    private boolean isHeap(int i) {
        if (i >= size()) { // If the index is out of bounds, return true.
            return true;
        }
        int left = leftChild(i); // Get the index of the left child.
        int right = rightChild(i); // Get the index of the right child.
        if (left < size() && comparator.compare(heap.get(i), heap.get(left)) < 0) { // If the left child is smaller than the element,
            return false; // the heap property is violated.
        }
        if (right < size() && comparator.compare(heap.get(i), heap.get(right)) < 0) { // If the right child is smaller than the element,
            return false; // the heap property is violated.
        }
        return isHeap(left) && isHeap(right); // Check if the heap property is valid for the children.
    }

    public void printHeap() {
        if (heap.isEmpty()) {
            System.out.println("(heap is empty)");
            return;
        }
        System.out.println("------");
        int depth = (int) Math.floor(Math.log(heap.size() + 1) / Math.log(2));
        printHeap(0, depth, "");
        System.out.println("------");
    }

    private void printHeap(int i, int depth, String indent) {
        if (i < heap.size()) {
            printHeap(rightChild(i), depth - 1, indent + "   ");

            for (int j = 0; j < depth; j++) {
                System.out.print("   ");
            }
            System.out.println(heap.get(i));

            printHeap(leftChild(i), depth - 1, indent + "   ");
        }
    }*/
    
}
