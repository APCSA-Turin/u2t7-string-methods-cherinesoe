package U2T7_P3;

public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("computer", 5));
        System.out.println(methods.funnyString("absent", 3));
        System.out.println(methods.halvesReversed("interesting"));
        System.out.println(methods.pigLatin("food"));
        System.out.println(methods.removeCharacter("music", 4));
        System.out.println(methods.insertAt("hello", "hi", "l"));
        System.out.println(methods.endUp("school", 3));
        System.out.println(methods.yellOrWhisper("Hi there"));
        System.out.println(methods.starBetween("banana"));
    }
}
