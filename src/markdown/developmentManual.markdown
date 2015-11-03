## Development manual 

#### Team name - Unicorns
Auður Elisa Harðardottir  
Halldis Una Hreiðarsdottir  
Karlotta Guðlaugsdottir  
Perla Osk Hjartardottir  
Stefana Kristin Olafsdottir

#### Introduction
In this manual you will get instructions on what is needed and how to get the **TicTacToe game to build on a fresh machine.
#### Necessary software to create the TicTacToe game

  - Github 
  - Travis 
  - Heroku 
  - Gradle 
  - JDK
  - Advania
  - Markdown plugin

#### Source control

A link to the Github repository:
- https://github.com/UnicornsHR/TicTacTo

To access the source control clone the repository into your working directory and run the command:
- git clone git@github.com:UnicornsHR/TicTacTo.git

#### Build environment
The project is coded on a remote linux server hosted by Advania. Gradle Wrapper is used to enable automatic build. The Automated Continuous Integration Server Travis is used to perform all unit tests, build the project and push to Heroku.

 

#### Staging and production 
After the code has been changed it is pushed to github and a pull request is made, if travis passes all tests the pull request is merged with the master and travis pushes the product to Heroku.
