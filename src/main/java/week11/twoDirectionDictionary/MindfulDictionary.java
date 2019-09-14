package week11.twoDirectionDictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MindfulDictionary {

    Map<String, String> dictionary;
    String file;

    public MindfulDictionary() {
        this.dictionary = new HashMap<>();
    }

    public MindfulDictionary(String file) {
        this();
        this.file = file;
    }

    // Reads lines and puts them in "this.dictionary" HashMap
    public boolean load() {
        try {
            File fyle = new File(this.file);
            Scanner reader = new Scanner(fyle);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);

            for (String finishWord : this.dictionary.keySet()) {
                writer.write(this.dictionary.get(finishWord) + ":" + finishWord);
                writer.write("\n");
            }

            writer.close();
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word) && !this.dictionary.containsValue(translation)) {
            this.dictionary.put(word, translation);
        }
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
//            String key = "";
//
//            for (String possibleKey : this.dictionary.keySet()) {
//                if (this.dictionary.get(possibleKey).equals(word)) {
//                    key = possibleKey;
//                }
//            }

            String key = this.dictionary.keySet().stream()
                    .filter(keyWord -> this.dictionary.get(keyWord).equals(word))
                    .toString();

            this.dictionary.remove(key);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
//            String key = "";
//
//            for (String possibleKey : this.dictionary.keySet()) {
//                if (this.dictionary.get(possibleKey).equals(word)) {
//                    key = possibleKey;
//                }
//            }
//
//            return key;

            return this.dictionary.keySet().stream()
                    .filter(key -> this.dictionary.get(key).equals(word))
                    .collect(Collectors.joining(""));
        }

        return null;
    }
}
