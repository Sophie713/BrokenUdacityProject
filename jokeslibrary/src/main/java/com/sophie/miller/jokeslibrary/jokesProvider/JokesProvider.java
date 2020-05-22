package com.sophie.miller.jokeslibrary.jokesProvider;

import java.util.ArrayList;
import java.util.Arrays;

public class JokesProvider {
    ArrayList<String> jokes = new ArrayList<String>(Arrays.asList(
            "Q: How do you stay warm in an empty room?\n A: Go stand in the corner—it’s always 90 degrees.",
            "Q: What is the hardest shape to get out of? \nA: Tell me. \nQ: The trap-azoid.",
            "Did you hear about the statistician who drowned crossing a river?\nIt was three feet deep, on average.",
            "Q: What do you call friends who love math? \nA: algebros",
            "Never trust math teachers who use graph paper. They're always plotting something.",
            "Q: Are monsters good at math? \nA: No, unless you Count Dracula.",
            "I just saw my math teacher lock himself in his office with a piece of graph paper.\nI think he must be plotting something."));

    public String getJoke() {
        int jokePosition = (int) (Math.random() * (jokes.size()));
        return jokes.get(jokePosition);
    }

}
