public class StringExample{
    public static void main(String[]args) {
        String name = "Jakub Nasta";
        String prefix = "Mr.";
        System.out.println("Number of characters in name: "+name.length());

        System.out.println("Surname: " + name.substring(6));
        System.out.println("First name: " + name.substring(0, 5));
        
        System.out.println(prefix.concat(" ").concat(name));

        System.out.println("Name not exist: " + name.isEmpty());

        System.out.println("Second Character in name: " + name.charAt(1));
        System.out.println("Last Character in name: " + name.charAt(name.length() - 1));

        System.out.println("Does Jakub equal Jakub?: "+ "Jakub".equals("Jakub"));
    }
}