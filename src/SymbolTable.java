public class SymbolTable {

    private BinaryTree st;


    public SymbolTable(BinaryTree st) {
        this.st = st;
    }

    public SymbolTable() {
    }

    public void addNew(String value){
        if(this.st == null){
            this.st = new BinaryTree(new Node(value,null));
            System.out.println("Value " + value + " was added");
            return;
        }
        if(this.st.add(value)){
            System.out.println("Value " + value + " was added");
        }
        else{
            System.out.println("Can't add value " + value);
        }
    }

    public void exists(String value){
        if(this.st == null){
            System.out.println("Symbol table is empty!");
            return;
        }
        if(this.st.exists(value)){
            System.out.println("Value " + value + " is in the table");
        }
        else{
            System.out.println("Value " + value + " does not exist, can be added");
        }
    }

    public void printTree(){
        System.out.println(this.st.toString());
    }

    public void printPosition(String value){
        System.out.println(this.st.getPosition(value));
    }

}
