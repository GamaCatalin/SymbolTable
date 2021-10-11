public class BinaryTree {

    private Node root;

    public BinaryTree(Node root){
        this.root = root;
    }

    public boolean add(String value){
        if(this.root == null){
            return false;
        }
        return this.root.add(value);
    }

    public boolean exists(String value){
        if(this.root == null){
            return false;
        }
        return this.root.exists(value);
    }

    public String getPosition(String value){
        if(root == null || !exists(value)){
            return "";
        }
        return "root " + this.root.walkUntil(value);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
