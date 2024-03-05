public class PracticalNo4{

    public static void main(String[] args) {
        printName("  Sujit Kirpan  ");
    }

    public static void printName(String name) {

        name = name.trim();


        StringBuffer formattedName = new StringBuffer();

       
        int lastSpaceIndex = name.lastIndexOf(' ');

       
        formattedName.append(name.substring(lastSpaceIndex + 1));

        
        formattedName.append(",");

       
        formattedName.append(name.substring(0, lastSpaceIndex));

        
        System.out.println(formattedName.toString());
    }
}
