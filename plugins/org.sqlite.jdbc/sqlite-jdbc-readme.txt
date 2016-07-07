
Name: 	   SQLite JDBC
Version:   3.7.2
URL:	   https://bitbucket.org/xerial/sqlite-jdbc
License:   Apache License v2.0
Copyright: Copyright 2008 Taro L. Saito
           Copyright 2007 David Crawshaw <david@zentus.com>



-------------------------------------------------------------------------


SQLite JDBC Driver
------------------

SQLite JDBC, developed by Taro L. Saito, is a library for accessing
and creating SQLite database files in Java.

Our SQLiteJDBC library requires no configuration since native libraries
for major OSs, including Windows, Mac OS X, Linux etc., are assembled
into a single JAR (Java Archive) file.

The usage is quite simple; download our sqlite-jdbc library,
then append the library (JAR file) to your class path.


What is different from Zentus's SQLite JDBC?
--------------------------------------------

The current sqlite-jdbc implementation is based on the code of Zentus's SQLite JDBC driver.
We have improved it in two ways:

 * Support major operating systems by embedding native libraries of SQLite,
   compiled for each of them.
 * Remove manual configurations

In the original version, in order to use the native version of sqlite-jdbc, users had to set 
a path to the native codes (dll, jnilib, so files, etc.) through the command-line arguments,
e.g., -Djava.library.path=(path to the dll, jnilib, etc.),
or -Dorg.sqlite.lib.path, etc.

This process was error-prone and bothersome to tell every user to set these variables.
Our SQLiteJDBC library completely does away these inconveniences.

Another difference is that we are keeping this SQLiteJDBC library up-to-date to the
newest version of SQLite engine, because we are one of the hottest users of this library.
For example, SQLite JDBC is a core component of UTGB (University of Tokyo Genome Browser)
Toolkit, which is our utility to create personalized genome browsers.

