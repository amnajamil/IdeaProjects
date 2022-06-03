import java.util.Locale;

public class JavaAssignment02 {
    public static void main(String[] args){
        String name = "amna";
        String email = "amnajamil@yahoo.com";
        String address = "newyork, US";
        String phone = "9176187609";
        int id = 345;
        System.out.println("name:"+name);
        System.out.println("email:"+email);
        System.out.println("address: "+address);
        System.out.println("phone:" +phone);
        System.out.println("id:"+id);
        JavaAssignment02 widning = new JavaAssignment02();
        widning.flottodouble();
        widning.bytetofloat();
        widning.getthechar();
        widning.length();
        widning.concatenate();
        widning.softwarestring();
        widning.myname();
        widning.name();
    }

    public void flottodouble(){
        float a = 56.5F;
        double b = a;
        System.out.println("widning typcasting");


    }

    public void bytetofloat(){
        byte x = 15;
        float y = x;
        System.out.println("widning type casting");
    }

    public void getthechar(){
        String name = "automation" ;
        char ch  = name.charAt(5);
        System.out.println("its is a");
    }

    public void length(){
        String name = "automation";

        System.out.println("this is string length"+name.length());
    }

    public void concatenate(){
        String x = "1005";
        String y = "100";
        String z = x.concat(y);
        System.out.println(z);
    }
    public void softwarestring(){
        String n = "software";
        String m = "hardware";
        String u = n.concat(m);
        System.out.println(u);
    }
    public void myname(){
        String s1="AMNA JAMIL";
        String s1lower=s1.toLowerCase();
        System.out.println("my name in lowercase"+s1lower);
    }
    public void name(){
        String s1="amnajamil";
        String s1upper=s1.toUpperCase();
        System.out.println("my name in lowercase"+s1upper);
    }



}
