SET CP=.
SET CP=%CP%;..\..\lib\castor-0.9.5-xml.jar
SET CP=%CP%;..\..\lib\xercesImpl_2.5.0.jar


SET ARGS=-dest src -types j2 -verbose
SET GENERATOR=org.exolab.castor.builder.SourceGenerator


java -cp %CP% %GENERATOR% %ARGS% -i ..\schema\evotype.xsd
java -cp %CP% %GENERATOR% %ARGS% -i ..\schema\evoobject.xsd
java -cp %CP% %GENERATOR% %ARGS% -i ..\schema\evoinstance.xsd
java -cp %CP% %GENERATOR% %ARGS% -i ..\schema\evoobjectstotypes.xsd

