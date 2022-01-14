import java.util.ArrayList;

public class dictionaryClass {
    public static void arrayList(ArrayList<String> language){
        System.out.print("Elements are: ");
        for(String elements : language){
            System.out.print(elements+" ");
        }
    }
    public static void main(String[] args){
        // Get current working directory
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);
        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("C++");
        language.add("Ruby");
        arrayList(language);

        System.out.println();
        ArrayList<String> languages = new ArrayList<>();
        languages.addAll(language);
        languages.forEach((e)->{
            System.out.println(e + " ");
        });


    }
}