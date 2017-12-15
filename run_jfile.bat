@Echo Off
if exist PSL.class (
    del PSL.class
)
java -jar Jasmin/jasmin.jar %1.j
java -cp .;PascalRTL.jar PSL