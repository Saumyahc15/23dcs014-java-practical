class Test {
    void m1() {
        m2();
    }

    void m2() {
        m3();
    }

    void m3() {
        System.out.println("HI");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            
        }
        System.out.println("HELLO");
    }
}

class extra4 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m1();
    }
}
