import java.util.function.Consumer;

public class NestedClass {
    private String outerString = "outerString";

    InnerClass inner = new InnerClass();

    public NestedClass() {
        outerMethod();
    }

    private void outerMethod() {
        System.out.println("outerMethod");
        System.out.println("inner string: " + inner.innerString);
        inner.innerMethod();
        inner.anonymus.accept(this);
    }

    private class InnerClass {
        private String innerString = "innerString";
        private Consumer anonymus;
        private void innerMethod() {
            System.out.println("innerMethod");
            System.out.println("outerString: " + outerString);
            anonymus = new Consumer() {
                @Override
                public void accept(Object o) {
                    System.out.println("inside anonymus");
                    System.out.println(outerString);
                    System.out.println(innerString);
                }
            };
        }


    }

}
