all: objects
	java Lab3App.java
objects:
	javac Lab3SortAlgo.java
	javac Lab3App.java
clean:
	rm -f *.class
