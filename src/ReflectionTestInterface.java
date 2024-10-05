public interface ReflectionTestInterface {

    void methodInterfaceWithoutBody ();

    default void methodInInterface() {
        System.out.println("interface method called");

    }
}
