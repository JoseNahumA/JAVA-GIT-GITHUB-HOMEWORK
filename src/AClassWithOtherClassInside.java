public class AClassWithOtherClassInside {
    public class OuterClass {
        public int outerField;

        public OuterClass(int outerField) {
            this.outerField = outerField;
        }
        public void outerMethod() {
            System.out.println("Method of the external class");
        }
        public class InnerClass {
            private int innerField;

            public InnerClass(int innerField) {
                this.innerField = innerField;
            }
            public void innerMethod() {
                System.out.println("Method of the inner class");
                System.out.println("Value of the external class field from the internal one: " + outerField);
            }
        }
    }
}
