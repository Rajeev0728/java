public class commonused {
    public static void main(String[] args) {

        String name = "Rajeev";

        System.out.println(name.length());

        String lstring = name.toLowerCase();    // rajeev
        System.out.println(lstring);

        String ustring = name.toUpperCase();    //RAJEEV
        System.out.println(ustring);

        System.out.println(name.substring(2));     // jeev
        System.out.println(name.substring(2,4));   // je

        System.out.println(name.replace('R','p'));  // pajeev
        System.out.println(name.startsWith("Raj"));     // true
                System.out.println(name.endsWith("eev"));       // true
    } 
}