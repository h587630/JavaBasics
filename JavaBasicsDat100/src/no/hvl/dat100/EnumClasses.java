package no.hvl.dat100;

public class EnumClasses {
    public enum Kortfarge
    {
        KORTFARGE, RUTER, HJERTER, SPAR;

    }

    public static void main(String[] args) {
       Kortfarge kortfarfe= Kortfarge.SPAR;
       System.out.println(kortfarfe);

        System.out.println("Bruk av ordinal : ");
        System.out.println(kortfarfe.ordinal());
       for( Kortfarge k: Kortfarge.values())

    System.out.println(k+" ");
    }
}
