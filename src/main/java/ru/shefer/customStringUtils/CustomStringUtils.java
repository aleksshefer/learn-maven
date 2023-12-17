package ru.shefer.customStringUtils;

public class CustomStringUtils {
    public String reverseString(String target) {
        StringBuilder sb = new StringBuilder(target);
        return sb.reverse().toString();
    }
}
