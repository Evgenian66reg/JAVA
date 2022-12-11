public class Main {

    static class MetalClass {
        public static MetalClass IRON = new MetalClass("IRON");
        public static MetalClass COPPER = new MetalClass("COPPER");
        public static MetalClass ALUMINIUM = new MetalClass("ALUMINIUM");
        public static MetalClass SILVER = new MetalClass("SILVER");
        public static MetalClass GOLD = new MetalClass("GOLD");
        public static MetalClass PLATINUM = new MetalClass("PLATINUM");

        private final String name;
        public MetalClass(String name){ this.name = name; }

        @Override
        public String toString() { return this.name; }
    }

    static class DepartmentClass {
        public static DepartmentClass NON_FERRUM_METALS = new DepartmentClass("NON FERRUM METALS");
        public static DepartmentClass BLACK_METALS = new DepartmentClass("BLACK METALS");


        private final String name;
        public DepartmentClass(String name){ this.name = name; }

        @Override
        public String toString() { return this.name; }
    }

    public static void main(String[] args) {
        MetalClass metal = null;
        DepartmentClass department = null;
        System.out.println("Metal is " + metal.IRON + " transported in " + department.BLACK_METALS + " department");
        System.out.println("Metal is " + metal.COPPER + " transported in " + department.NON_FERRUM_METALS + " department");
        System.out.println("Metal is " + metal.ALUMINIUM + " transported in " + department.NON_FERRUM_METALS + " department");
        System.out.println("Metal is " + metal.SILVER + " transported in " + department.NON_FERRUM_METALS + " department");
        System.out.println("Metal is " + metal.GOLD + " transported in " + department.NON_FERRUM_METALS + " department");
        System.out.println("Metal is " + metal.PLATINUM + " transported in " + department.NON_FERRUM_METALS + " department");
    }
}