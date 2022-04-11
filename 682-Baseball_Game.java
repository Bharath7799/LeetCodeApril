import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(String el: ops) {
            if(el.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if(el.equals("C")) {
                stack.pop();
            } 
            else if(el.equals("+")){
                int num1 = stack.pop();
                int num2 = stack.peek() + num1;
                stack.push(num1);
                stack.push(num2);
            }else {
                stack.push(Integer.parseInt(el));
            }
        }
        int ans = 0;
        // while(!stack.empty())
        //     ans += stack.pop();
        
        for(int score: stack) ans+=score;
        
        return ans;
    }
}