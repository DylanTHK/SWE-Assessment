# SWE-Assessment
Software Development Fundamentals Assessment

task01
javac -sourcepath task01/src -d task01/classes task01/src/mail/*.java
java -cp task01/classes mail.Main <file.csv> <template.txt>
java -cp task01/classes mail.Main thankyou.csv thankyou.txt
java -cp task01/classes mail.Main tour_packages.csv tour_packages.txt