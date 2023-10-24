import java.util.ArrayList;
import java.util.Arrays;

public class LAB1 {
    
    public static void main (String[] args){

        int[] x={1,2,3,4,5}, y = {6,7,8,9,10};
        int[] z={5,5,5,10,10};

        System.out.print("Array x = {");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
            if (i!=x.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
        
        System.out.print("Array y = {");
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]);
            if (i!=x.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for(int i=0;i<z.length;i++){
            System.out.print(z[i]);
            if (i!=x.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
        

        ArrayList<String> str = new ArrayList<String>();
        str.add("Mon");
        str.add("Tue");
        str.add("Wed");
        str.add("Thu");
        str.add("Fri");

        System.out.print("Names = {");
        for(int i=0;i<str.size();i++){
            System.out.print(str.get(i));
            if (i!=x.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        for(int i=0;i<str.size();i++){
            String name = str.get(i);
            String new_name = Character.toString(name.charAt(name.length() - 1)).toUpperCase()+ name.substring(1, name.length() - 1)+ 
            Character.toString(name.charAt(0)).toLowerCase();
            str.set(i, new_name);
        }



        System.out.print("Names (switched) = {");
        for(int i=0;i<str.size();i++){
            System.out.print(str.get(i));
            if (i!=x.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
        

    }
}