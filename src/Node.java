import java.util.Arrays;

public class Node {
    private Node parent;
    private Node rChild;
    private Node lChild;

    private final String value;


    public Node(String value,Node parent){
        this.value = value;
        this.parent = parent;
    }

    public boolean add(String value){
        char[] thisValue = this.value.toCharArray();
        char[] valueArray = value.toCharArray();
        int compareValue = Arrays.compare(valueArray,thisValue);


        if(compareValue == 0){
            return false;
        }

        if(compareValue < 0){
            if(this.lChild == null){
                this.lChild = new Node(value,this);
                return true;
            }
            return this.lChild.add(value);
        }

        if(compareValue > 0){
            if(this.rChild == null){
                this.rChild = new Node(value,this);
                return true;
            }
            return this.rChild.add(value);
        }

        return false;
    }


    public boolean exists(String value){
        char[] thisValue = this.value.toCharArray();
        char[] valueArray = value.toCharArray();
        int compareValue = Arrays.compare(valueArray,thisValue);

        if(compareValue == 0){
            return true;
        }

        if(compareValue < 0){
            if(this.lChild == null){
                return false;
            }
            return this.lChild.exists(value);
        }

        if(compareValue > 0){
            if(this.rChild == null){
                return false;
            }
            return this.rChild.exists(value);
        }
        return false;
    }

    public String walkUntil(String value){
        char[] thisValue = this.value.toCharArray();
        char[] valueArray = value.toCharArray();
        int compareValue = Arrays.compare(valueArray,thisValue);

        if(compareValue == 0){
            return "";
        }

        if(compareValue < 0){
            return "L " + this.lChild.walkUntil(value);
        }

        if(compareValue > 0){
            return "R " + this.rChild.walkUntil(value);
        }
        return "!!";
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(value);
        if(this.rChild != null){
            builder.append("\n\tR-> ");
            builder.append(this.rChild.toString());
        }
        if(this.lChild != null){
            builder.append("\n\tL-> ");
            builder.append(this.lChild.toString());
        }
        return builder.toString();
    }
}
