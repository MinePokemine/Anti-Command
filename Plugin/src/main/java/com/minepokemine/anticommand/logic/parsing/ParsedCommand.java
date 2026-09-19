package com.minepokemine.anticommand.logic.parsing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ParsedCommand {
    public String command;
    public String[] args;

    public ParsedCommand(String commandString) {
        Queue<Character> str = new ArrayDeque<>();
        StringBuilder command = new StringBuilder();
        List<String> args = new ArrayList<>();

        for (Character ch : commandString.toCharArray()) {
            str.add(ch);
        }

        if (str.peek() == '/') {
            str.poll();
        }

        while (!str.isEmpty()) {
            char c = str.poll();
            if (c == ' ') {
                break;
            }
            command.append(c);
        }

        this.command = command.toString();

        while (!str.isEmpty()) {
            StringBuilder arg = new StringBuilder();
            while (!str.isEmpty()) {
                char c = str.poll();
                if (c == ' ') {
                    break;
                }
                arg.append(c);
            }

            args.add(arg.toString());
        }

        this.args = args.toArray(new String[0]);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("/");
        str.append(command);
        for (String arg : args) {
            str.append(' ');
            str.append(arg);
        }

        return str.toString();
    }
}
