public class ArrayStack<T> implements Stack<T> 
{
    
    private T[] arr;
    private int top = -1;		//top of stack is initialized to -1
    
    public ArrayStack() 
    {
        Object[] tempArray = new Object[10]; //default array size 
        arr = (T[]) tempArray;
    }
     
    /*
     * empty()
     * this function check if the array is empty or not 
     */
    public boolean empty() 
    {
        return top == -1;
    }

   /*
    * push(T item)
    * this function adds an item to the array
    */
   
    public void push(T item) 
    {
        if (top == arr.length - 1) 
        {
            growArray();
        }
        arr[++top] = item;
    }
    
    
    /*
     * pop()
     * this function pops the top of the stack
     */
    public T pop() 
    {
    	
        if (empty()) 
        {
            return null;
        }
        return arr[top--];
    }
  
    /*
     * peek()
     * this function allows us to see what is on top of the stack
     */
   
    public T peek() 
    {
        if (empty()) 
        {
            return null;
        }
        return arr[top];
    }
    
    
    /*
     * growArray()
     * this function doubles the array when the current array is full
     */
    
    private void growArray() 
    {
        Object[] tempArray = new Object[arr.length * 2];
        T[] currArr = (T[]) tempArray;
        for (int i = 0; i < arr.length; i++) 
        {
            currArr[i] = arr[i];
        }
        arr = currArr;
    }
    
}