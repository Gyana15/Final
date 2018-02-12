set ProjectPath=C:\Users\GYAAN\Desktop
echo %ProjectPath%
set classpath=%ProjectPath%\bin\*;%ProjectPath%\Lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\TestSuiteNaukri.xml