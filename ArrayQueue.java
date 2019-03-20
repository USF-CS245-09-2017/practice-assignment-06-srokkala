
public class ArrayQueue<T> implements Queue<T> 
{
    
    private int head = 0;
    private int tail = 0;
    private T[] arr;
    
    
    
   
    public ArrayQueue() 
    {
        Object[] tempArray = new Object[10];		//default array size
        arr = (T[]) tempArray;
    }
    
    
   // checks if queue is empty 
    public boolean empty() 
    {
        return head == tail;
    }
    
   
    
 
 // Adds an item to the end of the queue   
    public void enqueue(T item) 
    {
        if (tail == arr.length) 
        {
            growArray();
        }
        arr[tail++] = item;
    }
    
    
    /*creates an array that is twice as big
     * copies each item in queue to nameArr after iterating through arr
     */
    
    private void growArray() 
    {
        Object[] tempArray = new Object[arr.length * 2];
        T[] nameArr = (T[]) tempArray;
        for (int i = 0; i < arr.length; i++) 
        {
            nameArr[i] = arr[i];
        }
        arr = nameArr;
    }
    
    //removes the first element in the queue and returns it
    //the head is incremented to next index in queue
    public T dequeue() 
    {
        if (empty()) 
        {
            return null;
        }
        return arr[head++];
    }
    
 
  
   
    
    
}