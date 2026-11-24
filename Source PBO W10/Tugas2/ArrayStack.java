import java.util.*;

public class ArrayStack<T> {
    private ArrayList<T> items;

    public ArrayStack(){
        items = new ArrayList<T>();
    }
    public void push(T item){
        items.add(item);
    }
    public T pop(){
        if (isEmpty())
            throw new ArrayStoreException("Underflow Error");
        return items.remove(items.size() - 1);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message){
            super(message);
        }
    }
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); 
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        ArrayStack<String> kata = new ArrayStack<String>();
        kata.push("a");
        kata.push("b");
        System.out.println(kata.pop());
        System.out.println(kata.pop());
        System.out.println(kata.isEmpty());
        try{
            kata.pop();
        } catch (ArrayStackException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
