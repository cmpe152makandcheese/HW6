@Echo Off

if "%~1"=="" (
	Echo "No arguments were entered"
) else (

	cd src
	javac -cp .;../Antlr/antlr-4.7-complete.jar PSL.java
	java -cp .;../Antlr/antlr-4.7-complete.jar PSL %1.psl
	
	java -jar ../Jasmin/jasmin.jar PSL.j
	java -cp .;../PascalRTL.jar PSL
	cd ..
)
