//Write an application that encodes English-language phrases into pig Latin. Pig
// Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
// simplicity, use the following algorithm:
// To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
// with String method split. To translate each English word into a pig Latin word, place the first
// letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
// becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputer
//cay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
// words separated by blanks, there are no punctuation marks and all words have two or more letters.
// Method printLatinWord should display each word. Each token is passed to method printLatin
//Word to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
// all the converted sentences in a text area.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PigLatin_14_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pig Latin Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 400);

        JLabel inputLabel = new JLabel("Enter English phrase:");
        JTextField inputField = new JTextField(30);
        JButton convertButton = new JButton("Convert to Pig Latin");
        JTextArea resultArea = new JTextArea(15, 40);
        resultArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        JPanel inputPanel = new JPanel();
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(convertButton);

        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText().trim();
                if (!inputText.isEmpty()) {
                    String pigLatinSentence = convertToPigLatin(inputText);
                    resultArea.append(pigLatinSentence + "\n");
                    inputField.setText("");
                }
            }
        });

        frame.setVisible(true);
    }

    public static String convertToPigLatin(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder pigLatinPhrase = new StringBuilder();

        for (String word : words) {
            pigLatinPhrase.append(convertWordToPigLatin(word)).append(" ");
        }

        return pigLatinPhrase.toString().trim();
    }

    public static String convertWordToPigLatin(String word) {
        if (word.length() > 1) {
            String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
            return pigLatinWord.toLowerCase();
        } else {
            return word;
        }
    }
}