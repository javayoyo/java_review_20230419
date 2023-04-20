package ex;

import org.w3c.dom.ls.LSOutput;

public class HelloService {


    public void hello1 () {
        System.out.println("hello1");
    }

        public int hello2(String str1) {

        // 매개변수 soutp 자동완성
//            System.out.println("str1 = " + str1);

        if(str1.length() >=5) {
            return 1;
        }else {
            return 0;
        }

        }

}
