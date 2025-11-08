//Program to define generic functional interface Palindrome

package day19;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
