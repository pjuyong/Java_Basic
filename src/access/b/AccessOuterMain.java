package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 deault 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        //data.privateField = 3;
        //data.privateMthod();

        data.innerAccess();
    }
}
