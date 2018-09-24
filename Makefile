all: objects
	java Lab3MergeSortApp
objects:
	javac Lab3InsertionSort.java
	javac Lab3MergeSortApp.java
	javac Lab3MergeSort.java
clean:
	rm -f *.class
