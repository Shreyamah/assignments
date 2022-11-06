public class Arith {
    public static void main(String[] args) {
        Addable test=( a, b)->(a+b);

        Addable test1=( a, b)->(a*b);
        Addable test2=( a, b)->(a-b);
        Addable test1=( a, b)->(a/b);
        System.out.println(test.cal(10,20));
        System.out.println(test1.cal(100,5));
        System.out.println(test1.cal(10,5));
        System.out.println(test1.cal(200,10));
    }
    }
    }
    }
