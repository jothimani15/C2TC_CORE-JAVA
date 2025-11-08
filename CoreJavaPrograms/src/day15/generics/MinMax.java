//Program to demonstrate generic interface
package day15;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

