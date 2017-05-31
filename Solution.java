import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
int flag = 0,index = 0,k=0;
char c = ' ';
String letters = "abcdefghijklmnopqrstuvwxyz";
Scanner in = new Scanner(System.in);
String s = in.next();
int n = in.nextInt();
int u[] = new int[s.length()];
ArrayList<Integer> uList = new ArrayList<Integer>();
for(int j = 0;j<s.length();j++){
if(c!= s.charAt(j)){
c = s.charAt(j);
index = letters.indexOf(c);
u[j] = index + 1;
}
else{
u[j] = u[j - 1] + index + 1;
}
uList.add(u[j]);
}
for(int a0 = 0; a0 < n; a0++){
int x = in.nextInt();
// your code goes here

boolean contains = uList.contains(x);
if(contains){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
}
