# Apache-Thrift
  The Apache Thrift software framework, for scalable cross-language services development, combines a software stack with a code generation engine to build services that work efficiently and seamlessly between C++, Java, Python, PHP, Ruby, Erlang, Perl, Haskell, C#, Cocoa, JavaScript, Node.js, Smalltalk, OCaml and Delphi and other languages. 
  
# How to start
 1) Download thrift.exe for windows. for this tutorial, it is available in my code repo.
 2) Create thrift file to define inteface definition and type needed for API. sample add.thrift is available in code
 3) run command thrift-0.10.0.exe --gen java add.thrift for genarating java RPC code whic could be sued for client-server connection.
 4) Once done, use the code of generating server and client with the help of generated code. use library:
 
  <dependency>
            <groupId>org.apache.thrift</groupId>
            <artifactId>libthrift</artifactId>
            <version>0.10.0</version>
            <!-- <type>pom</type> -->
  </dependency>
    


