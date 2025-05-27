import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            
            Class<?> clazz = Class.forName("Student");

            Object obj = clazz.getDeclaredConstructor().newInstance();
           
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Methods in class Student:");
            for (Method method : methods) {
                System.out.print("- " + method.getName() + "(");
                Class<?>[] params = method.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getSimpleName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            Method sayHelloMethod = clazz.getMethod("sayHello");
            sayHelloMethod.invoke(obj);

            Method greetMethod = clazz.getMethod("greet", String.class);
            greetMethod.invoke(obj, "Alice");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
