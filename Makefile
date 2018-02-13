all:
	javac ${PWD}/com/craftinginterpreters/lox/*.java

clean:
	rm -f ${PWD}/com/craftinginterpreters/lox/*.class
