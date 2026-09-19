package com.minepokemine.anticommand.logic.parsing;

import java.util.List;
import java.util.Queue;

public class CommandParser {
    public Queue<Character> str;
    public String command;
    public List<String> args;

    public CommandParser(String command) {
        for (Character ch : command.toCharArray()) {
            str.add(ch);
        }

        if (str.peek() == '/') {
            str.poll();
        }

        while (true) {

        }
    }
}
