package Ex3;

public class countCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        char ch = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.print("The character '" + ch + "'appears " + count + " times " + "'");
    }

}
