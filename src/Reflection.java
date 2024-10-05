import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public void createClass (){
        System.out.println("^^^^^^^^^^^^^^^^^^^^class person");
        checkIsClassOrInterface(Person.class); //hard coded literall value
        System.out.println("^^^^^^^^^^^^^^^^^^interface");
        checkIsClassOrInterface(ReflectionTestInterface.class); //hard coded literall value

    }

    private void checkIsClassOrInterface (Class checkMethods) {

        Method [] methods = checkMethods.getMethods() ;
        int i = 1;
        for (Method methodItem: methods ) {

            methodItem.setAccessible(true);
            System.out.println( i + "- " + methodItem.getName());
            i++;
        }
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
