package stack.and.queue;

import java.util.Map;
import java.util.regex.Pattern;

import static java.util.Map.entry;

public class MultiBracketValidation {

    static Map<Character, Character> pairs = Map.ofEntries(
            entry('{', '}'),
            entry('[', ']'),
            entry('(', ')')
    );

    public static boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(pairs.containsKey(c)) stack.push(c);
            if(pairs.containsValue(c)){
                if(pairs.get(stack.peek()) == c) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

}

}