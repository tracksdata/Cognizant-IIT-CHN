SETUP:
You'll need to set up two Java SDKs in your IDE:
Java 8 for most of the code, and Java 6 (or 5 or 7) for the java6examples module.

In IntelliJ, that involves:
0. Get the two SDKs downloaded and installed on your computer.
1. open the Project Structure dialog.
2. Choose Modules, then Examples.
3. On the Dependencies tab, select the Module SDK.
  a. If you have Java 8 installed, select it from the dropdown.
  b. Otherwise, choose New... and then locate the SDK's home directory.
4. Next pick the java6examples module, and repeat step 3 for the earlier SDK.

CONTENTS:
The examples show several versions of the same code.
Here's the order of the packages here, as referenced in the video:

1) original
The Object-Oriented style I used before I knew FP

2) functionsAsValues
Lambdas make the program ultra-simple. This includes the lambda examples.

3) functionsReturningFunctions
Duplication is removed by creating functions inside static methods.

4) typeSafe
Restore type safety by creating many classes, but no deep hierarchy.

5) java6 (under java6examples)
This is in a different module, since it uses a different version of the Java compiler.