package week3.loops.tuesday;

public class StringCommands {
    public static void main(String[] args) {

                    //todo lengh
        String text="its raining outside";
        int count=text.length();
        System.out.println(count);

        // todo equals
        String text1 = "java";
        String text2 = "python";
        System.out.println(text1.equals(text2));

        //todo indexOf]
        String word = "Example";
        int index = word.indexOf('a');
        System.out.println(index);

        // todo charAt
        String word2 = "example";
        char position = word2.charAt(4);
        System.out.println(position);

        //todo isEmpty
        String name="Aiana";
        String name1="  ";
        String name2="";

        boolean n1=name.isEmpty();
        boolean n2=name1.isEmpty();
        boolean n3=name2.isEmpty();
        System.out.println(n1+" "+n2+" "+n3);

        //todo int to String
        int number=1212;
        String intToStr= Integer.toString(number);
        System.out.println(intToStr);

        //todo string to integer
        String num="1212";
        int stringToInt=Integer.valueOf(num);
        System.out.println(stringToInt);

        //todo raining
        String word1 = "raining";
        char firstLetter=word.charAt(0);
        char lastLetter=word.charAt(word1.length() - 1);
        System.out.println(firstLetter+" "+lastLetter);

        String word3 = "raining";
        System.out.println(word3.indexOf("n"));

                //todo lower Case Upper Case
                String any = "Aiana Nazik";
                System.out.println(any.toUpperCase());
            }
        }
