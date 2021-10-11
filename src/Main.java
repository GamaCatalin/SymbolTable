public class Main {

    public static void main(String[] args) {
        SymbolTable st = new SymbolTable();

        st.addNew("a");
        st.addNew("b");
        st.addNew("c");
        st.addNew("c");

        st.addNew("abc");
        st.addNew("bca");


        System.out.println("===================");
        System.out.println();
        st.exists("a");
        st.exists("b");
        st.exists("abc");
        st.exists("xyz");

        System.out.println("===================");
        System.out.println();

        st.printPosition("abc");
        st.printPosition("bca");
        st.printPosition("abca");

    }
}
