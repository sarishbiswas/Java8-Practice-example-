package Default.MultipleInheritance;

public interface Interface3 {
    default void methodC(){
        System.out.println("Inside method C of Interface 3");
    }
}
