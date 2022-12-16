# SWE-Assessment
Software Development Fundamentals Assessment


Compile and running guide:

task01
<!-- compile -->
javac -sourcepath src -d classes src/mail/*.java
<!-- run -->
java -cp classes mail.Main <file.csv> <template.txt>
java -cp classes mail.Main thankyou.csv thankyou.txt
java -cp classes mail.Main tour_packages.csv tour_packages.txt

task02 (Compile and run)
<!-- compile -->
javac -sourcepath src -d classes src/calculator/*.java
<!-- run -->
java -cp classes calculator.Main