
public class StacksTests {

	   /**
     * Klasse zum testen von Stack<E>, ArrayStack<E>, ListStack<E> und java.util.Stack<E> mit Datentyp String und Integer
     * @author Sebastian Nadler
     * 
     */
    public static void main(String[] args) {
        Stack<Integer> is = new ArrayStack<>(6); //is - IntegerStack
        try {
            //TestEnde
            System.out.println(is); // Stapel-Inhalt ausgeben

            // Elemente hinzuguegen
            is.push(new Integer(3));
            is.push(new Integer(4));
            is.push(new Integer(1));
            is.push(new Integer(3));
            is.push(new Integer(5));
            is.push(new Integer(2));
            System.out.println(is); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("is.pop " + is.pop());
            System.out.println("is.pop " + is.pop());
            System.out.println("is.pop " + is.pop());
            System.out.println(is); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            is.push(new Integer(1));
            is.push(new Integer(2));
            is.push(new Integer(3));
            System.out.println(is); // Stapel-Inhalt ausgeben

            is.push(new Integer(3)); // Testen der Exception bei vollem Stapel
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        Stack<String> sts2 = new ArrayStack<>(5);//string stack
        try {
            System.out.println(sts2); // Stapel-Inhalt ausgeben
            // Elemente hinzuguegen (auto boxing)
            sts2.push("test1"); 
            sts2.push("test2");
            sts2.push("test3");
            sts2.push("test4");
            sts2.push("test5");
            System.out.println(sts2); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("sts2.pop " + sts2.pop());
            System.out.println("sts2.pop " + sts2.pop());
            System.out.println("sts2.pop " + sts2.pop());
            System.out.println(sts2); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            sts2.push("test1");
            sts2.push("test2");
            sts2.push("test3");
            System.out.println(sts2); // Stapel-Inhalt ausgeben

            sts2.push("voll"); // Testen der Ausnahme bei vollem Stack
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }


        Stack<Integer> is3 = new ListStack<>(); //next Integer Stack
        try {
            System.out.println(is3); // Stapel-Inhalt ausgeben

            // Elemente hinzuguegen
            is3.push(new Integer(3));
            is3.push(new Integer(7));
            is3.push(new Integer(1));
            is3.push(new Integer(2));
            is3.push(new Integer(1));
            System.out.println(is3); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("is3.pop " + is3.pop());
            System.out.println("is3.pop " + is3.pop());
            System.out.println("is3.pop " + is3.pop());
            System.out.println(is3); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            is3.push(new Integer(1));
            is3.push(new Integer(2));
            is3.push(new Integer(3));
            System.out.println(is3); // Stapel-Inhalt ausgeben

            is3.push(new Integer(3)); // Ausnahme FullStackException bei der Array-Implementierung
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        Stack<String> sts4 = new ListStack<>();//net String Stack
        try {
            System.out.println(sts4); // Stapel-Inhalt ausgeben
            // Elemente hinzuguegen (auto boxing)
            sts4.push("test1"); 
            sts4.push("test2");
            sts4.push("test3");
            sts4.push("test4");
            sts4.push("test5");
            System.out.println(sts4); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("sts4.pop " + sts4.pop());
            System.out.println("sts4.pop " + sts4.pop());
            System.out.println("sts4.pop " + sts4.pop());
            System.out.println(sts4); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            sts4.push("test1");
            sts4.push("test2");
            sts4.push("test3");
            System.out.println(sts4); // Stapel-Inhalt ausgeben

            sts4.push("voll"); //Test der Exception bei vollem Stack
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        java.util.Stack<Integer> is5 = new java.util.Stack<Integer>();//next Integer Stack
        try {
            System.out.println(is5); // Stapel-Inhalt ausgeben
            
            // Elemente hinzuguegen
            is5.push(new Integer(3));
            is5.push(new Integer(7));
            is5.push(new Integer(1));
            is5.push(new Integer(2));
            is5.push(new Integer(1));
            System.out.println(is5); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("is5.pop " + is5.pop());
            System.out.println("is5.pop " + is5.pop());
            System.out.println("is5.pop " + is5.pop());
            System.out.println(is5); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            is5.push(new Integer(1));
            is5.push(new Integer(2));
            is5.push(new Integer(3));
            System.out.println(is5); // Stapel-Inhalt ausgeben

            is5.push(new Integer(3)); // Test der Exception bei vollem Stack
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        java.util.Stack<String> sts6 = new java.util.Stack<>();//next String Stack
        try {
            System.out.println(sts6); // Stapel-Inhalt ausgeben
            // Elemente hinzuguegen (auto boxing)
            sts6.push("test1");
            sts6.push("test2");
            sts6.push("dfg");
            sts6.push("a");
            sts6.push("b");
            System.out.println(sts6); // Stapel-Inhalt ausgeben

            // Elemente entfernen
            System.out.println("sts6.pop " + sts6.pop());
            System.out.println("sts6.pop " + sts6.pop());
            System.out.println("sts6.pop " + sts6.pop());
            System.out.println(sts6); // Stapel-Inhalt ausgeben

            // Elemente hinzufuegen
            sts6.push("d");
            sts6.push("e");
            sts6.push("f");
            System.out.println(sts6); // Stapel-Inhalt ausgeben

            sts6.push("g"); // Testen der Exception bei vollem Stack
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }


    }
}


