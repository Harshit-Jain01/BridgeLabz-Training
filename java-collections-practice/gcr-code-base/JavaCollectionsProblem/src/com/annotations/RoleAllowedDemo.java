package com.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)            
@interface RoleAllowed {
    String value();                   
}

 class UserContext {

    private static String currentRole;

    public static void setRole(String role) {
        currentRole = role;
    }

    public static String getRole() {
        return currentRole;
    }
}
 

class AdminService {

     @RoleAllowed("ADMIN")
     public void deleteUser() {
         System.out.println("User deleted successfully!");
     }

     @RoleAllowed("ADMIN")
     public void viewAllUsers() {
         System.out.println("Displaying all users");
     }

     public void publicInfo() {
         System.out.println("Public information accessible to all.");
     }
 }



 class RoleValidator {

    public static void invokeWithRoleCheck(Object obj) throws Exception {

        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();

                if (requiredRole.equals(UserContext.getRole())) {
                    method.invoke(obj);
                } else {
                    System.out.println(
                        "Access Denied! Method: " + method.getName()
                    );
                }

            } else {
                method.invoke(obj); 
            }
        }
    }
}



public class RoleAllowedDemo{

	public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        System.out.println("USER Role");
        UserContext.setRole("USER");
        RoleValidator.invokeWithRoleCheck(service);

        System.out.println("\nADMIN Role");
        UserContext.setRole("ADMIN");
        RoleValidator.invokeWithRoleCheck(service);
    }
}
