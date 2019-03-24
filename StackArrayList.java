import java.util.ArrayList;

public class StackArrayList<X> implements Stack<X> {

    private ArrayList<X> list;

    public StackArrayList() {
        list = new ArrayList<X>();
    }


    public void push(X item) {
        list.add(item);
    }


    public X pop() {
        if(list.size()==0)
            throw new IllegalStateException("empty");
        return list.remove(list.size()-1);
    }


    public boolean isEmpty(X item) {
        return list.isEmpty(item);
    }


    public X peek(X item) {
        try {
            while (true) {
                    if (item == pop())
                        return item;
                }

            }
        catch (Exception e){
            System.out.println("Item not found ");
            return null;
        }

    }


    public int size() {
        return list.size();
    }
}

    
