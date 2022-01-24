package t2;

public class ClassInitDemo1 {

        public ClassInitDemo1() {
            System.out.println("constructor");
        }//4

        { // non-static
            System.out.println("non-static block");//3
        }

        static { // static
            System.out.println("static block");//1
        }

        public static void main(String[] arg) {
            System.out.println("main");//2
            ClassInitDemo1 cdm = new ClassInitDemo1();
        }
    }

