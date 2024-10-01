package com.nr.interview;



public class FirstletterCapital {
    public static void main(String[] args) {
        String str ="Naresh is engineer";
        String[] s = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for(String st : s){
            String result = st.substring(0,1).toUpperCase() + st.substring(1);
            sb.append(result+ " ");
        }
        System.out.println(sb);
    }
}
