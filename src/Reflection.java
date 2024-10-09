import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflection {

    public void createClass (){
        System.out.println("^^^^^^^^^^^^^^^^^^^^class person");
        checkIsClassOrInterface(Person.class); //hard coded literall value
      //  System.out.println("^^^^^^^^^^^^^^^^^^interface");
      //  checkIsClassOrInterface(ReflectionTestInterface.class); //hard coded literall value
    }

    private void checkIsClassOrInterface (Class checkMethods) {
        try {
            Method [] methods = checkMethods.getDeclaredMethods() ;
            int i = 0;
            for (Method methodItem: methods ) {
                for(int j = 0; j <methods.length;j++ ){

              //  methodItem.setAccessible(true);
                // If it's the private method, invoke it
//                if (methodItem.getName().equals("m1")) {
//                    methodItem.invoke(new Person());
//                        Person p = new Person();
//                        methodItem.invoke(p);
//                }
                System.out.println( i + "- " + methodItem.getName());
                i++;
                }
            }
        }
        catch (Exception e){

        }
        List <Integer > l = new ArrayList<>();
        l.stream().forEach();
    }

    public void checkMethodSFields(Class parameterClass){
        String className =  parameterClass.getName();
        Class c = Person.class.getDeclaringClass();
        Person p = new Person();
        Class c1 = parameterClass.getClass();
        try {
        //   Method method = c1.getMethod("testForRefection", int.class);
            System.out.println("--------------class");
            Method [] methodsDeclared = c1.getDeclaredMethods();

            Field[] fieldDeclared = c1.getDeclaredFields();
            Field[] field = c1.getFields();
            Field age = c1.getDeclaredField("age");
        }
        catch (NoSuchFieldException e){
        }
//        catch (NoSuchMethodException e){
//        }
    }
}
