# CS-305-Software-Security

    Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
    
Artemis Financial develops financial plans for its customers which include savings, retirement, investments, and insurance. 
They required modernizing they’re operations using the most current and effective software security practices. The client wanted 
to add file verification in the form of a checksum and add secure communication mechanisms to meet their requirements.

    What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software 
    security add to a company’s overall well-being?

Software security can ensure survivability in highly competitive markets by instilling customer trust in a company, especially today where cyber threats
are always increasing and becoming more sophisticated. Coding with security in mind builds security in the software community where snippets of code are 
regularly shared between developers as modularity is encouraged.

    Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging part of reading the vulnerability assessment was verifying and suppressing false positives. The process was straight forward but 
ensuring that it was a false positive I found difficult due to lack of training for the assessment tool. The tool itself was great to identify 
dependencies that require assessment for overall security of the program.

    How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased layers of security by identifying the applicability of seven areas of safety concern: input validation, secure API interactions, 
cryptography, client/server interactions, code error reporting, code quality, and encapsulation. Using these areas to assess code security in an 
application and Maven Dependency Check to assess any dependencies and third-party libraries will mitigate most if not all security vulnerabilities.

    How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether 
    you introduced new vulnerabilities?

I identified the areas of possible security vulnerabilities applicable to the application by reading and understanding what the code was trying to do 
and what the client wanted. I scanned the code and corrected obvious issues like input validation violations, determining whether encryption was
necessary, and industry standard commenting. I would then run the code looking for error containment and correctness of operation. Finally, I would run 
the Maven Dependency Check, draft a mitigation plan to address vulnerabilities found in the report, implement said plan, and run the check again ensuring 
that I did not introduce new vulnerabilities while addressing the existing issues.

    What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

We were introduced to a dependency checker, the NIST, and a variety of security features built into the Java language, such as keytool and Java’s 
random number generator. I subscribed to industry publications to keep up to date on security practices as well.

    Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you
    show future employers from this assignment?

I will show them how this assignment instilled within me a basic understanding of secure coding practices, how I incorporated the lessons learned, and 
how I advanced upon those lessons into my future coding assignments.
 

