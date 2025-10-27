public class NameOpsTester {
    public static void main(String[] args) {
        //Testing printMethodCall method
        NameOps.printMethodCall("whoIsAwesome", "Shriya");
        
        //Testing whoIsAwesome method
        System.out.println(NameOps.whoIsAwesome("Shriya"));

        //Testing indexOfFirstSpace method with no space and one space
        System.out.println(NameOps.indexOfFirstSpace("Shriya Vishwas"));
        System.out.println(NameOps.indexOfFirstSpace("Chetana"));

        //Testing indexOfSecondSpace method with no space and one space
        System.out.println(NameOps.indexOfSecondSpace("Orion Karthiveerya Ramakrishna"));
        System.out.println(NameOps.indexOfSecondSpace("Orion Ramakrishna"));

        //Testing findFirstName method
        System.out.println(NameOps.findFirstName("Keira Mueller"));

        //Testing findLastName method 
        //with a middle name, no middle name, and no last name
        System.out.println(NameOps.findLastName("Sabrina Rosa Hunter"));
        System.out.println(NameOps.findLastName("Sydney Heart"));
        System.out.println(NameOps.findLastName("Shriya"));

        //Testing findMiddleName method
        //with middle name, no middle name, and no last name
        System.out.println(NameOps.findMiddleName("Marissa"));
        System.out.println(NameOps.findMiddleName("Marrisa Victoria Mueller"));
        System.out.println(NameOps.findMiddleName("Marissa Mueller"));

        //Testing generateLastFirstMidInitial
        //With middle name, no middle name, and no last name
        System.out.println(NameOps.generateLastFirstMidInitial("Millie Bobbie Brown"));
        System.out.println(NameOps.generateLastFirstMidInitial("Gon Freecss"));
        System.out.println(NameOps.generateLastFirstMidInitial("Kirby"));
    }
}
