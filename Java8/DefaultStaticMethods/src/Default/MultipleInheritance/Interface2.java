package Default.MultipleInheritance;

public interface Interface2 {
    default void methodB(){
        System.out.println("Inside method B of Interface 2");
    }
}
