package t2;

public class ClassInitDemo1 {

        public ClassInitDemo1() {
            System.out.println("constructor");
        }

        { // non-static
            System.out.println("non-static block");
        }

        static { // static
            System.out.println("static block");
        }

        public static void main(String[] arg) {
            System.out.println("main");
            ClassInitDemo1 cdm = new ClassInitDemo1();
        }


    }

