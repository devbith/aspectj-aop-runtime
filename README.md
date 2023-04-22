##### Compile & Run
```
  javac -cp "lib/*" -d classes src/*.java

  java -javaagent:lib/aspectjweaver-1.9.19.jar -cp "lib/*:classes/" -Daj.weaving.verbose=true Runner
```
