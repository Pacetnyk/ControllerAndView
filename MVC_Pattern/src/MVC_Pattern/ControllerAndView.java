package MVC_Pattern;

class Dispatcher {
    public static void main(String[]args){
        Model m1 = new Model(10,8,0, ".");  // object m1 and call of constructor of the class model


//        int rightTriangle = ControllerAndView.add(m1);    // controller takes Model m1 and fields x and y from it and add them
//        ControllerAndView.display(summa);               // prints the result of addition
//        int rotatedLeftTriangle = ControllerAndView.add(m1);
//        ControllerAndView.display(summa);
//        int rotatedRightTriangle = ControllerAndView.add(m1);
//        ControllerAndView.display(summa);
          int leftTriangle = ControllerAndView.leftTriangleLoop(m1);
          ControllerAndView.display(leftTriangle);
//        int rectangle = ControllerAndView.subtract(m1);
//        ControllerAndView.display(subtraction);

    }
}


class ControllerAndView {
    static void display(int result){
        System.out.println(result);
    }
    public static void leftTriangleLoop(Model m) {
        //int numSize = 0;
        while (m.numSize < m.size) {
            printSpaces(m.size - m.numSize - 1);
            printDots(m.numSize);
            m.numSize++;
        }
    }
    public static void printSpaces(Model m) {
        int numSpaces = 0;
        while (numSpaces < m.number) {
            System.out.print(" ");
            numSpaces++;
        }
    }
    public static void printDots(Model m) {
        int numStar = 0;
        while (numStar <= m.number) {
            System.out.print(m.dots);
            numStar++;
        }
        System.out.println();
    }
}

class Model { // Class Model for initialization of variables and Method class
    int size; // declaration of variable size
    int number; // declaration of variable number
    int numSize;
    String dots;
    Model(int s, int n,int num1, String d){ // Constructor Model for packaging of class Model and
                                // transmission of variables to parameters of objects m1 and m2
        size = s;               // initialization of field x
        number = n;
        dots = d;
        numSize = num1;
    }
}
