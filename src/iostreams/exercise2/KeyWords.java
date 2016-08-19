package iostreams.exercise2;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class KeyWords {
    private ArrayList<String> wordsList;
    private HashMap<String, Integer> numOfWord;
    private String keywords[] = {"abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized", "boolean", "do",
            "if", "private", "this", "break", "double", "implements", "protected",
            "throw", "byte", "else", "import", "public", "throws", "case", "enum",
            "instanceof", "return", "transient", "catch", "extends", "int", "short",
            "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


    public KeyWords() {
        wordsList = new ArrayList<>();
        numOfWord = new HashMap<>();
    }

    public void checkWord(String word) {
        if (word.length() < 1) {
            return;
        }
        for (String i : keywords) {
            if (i.equals(word)) {
                addKeyword(word);
            }
        }
    }

    public void findKeywordsInTheFile(File f){
        StringBuilder str = new StringBuilder();
        try (FileReader is = new FileReader(f)) {
            int i = 0;
            char x;
            while (i != -1) {
                i = is.read();
                x = (char)i;
                switch (x) {
                    case ' ':
                    case '\r':
                    case '\n':
                    case ';':
                    case '(':
                    case ')':
                    case '{':
                    case '}':
                        if (str.length() > 1) {
                            this.checkWord(str.toString());
                        }
                        str.delete(0, str.length());
                        break;
                    default:
                        str.append(x);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeResultsIntoTheFile(File f){
        StringBuilder str = new StringBuilder();
        try(FileWriter os = new FileWriter(f)){
            for(String i : wordsList){
                str.append(i);
                str.append(" - ");
                str.append(numOfWord.get(i));
                str.append("\r\n");
                os.write(str.toString());
                str.delete(0, str.length());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private boolean addKeyword(String word) {
        if (!wordsList.contains(word)) {
            wordsList.add(word);
        }
        if (numOfWord.containsKey(word)) {
            Integer temp = numOfWord.get(word);
            temp += 1;
            numOfWord.put(word, temp);
        } else {
            numOfWord.put(word, 1);
        }
        return true;
    }

    public void print() {
        Collections.sort(wordsList);
        System.out.printf("%-14s", "Keyword");
        System.out.println("Number");
        System.out.println("--------------------");
        int sum = 0;
        for (String i : wordsList) {
            System.out.printf("%-14s", i);
            System.out.println(numOfWord.get(i));
            sum += numOfWord.get(i);
        }
        System.out.println("--------------------");
        System.out.printf("%-14s", "Sum:");
        System.out.println(sum);
    }


}
