# Java Programming and Software Engineering Fundamentals
- The foundational skills a software engineer needs to solve real-world problems, from designing algorithms to testing and debugging your programs.

**Setting Up the Java Development Enviroment**
- Install Homebrew [here](https://brew.sh/)
    - You may wish to add this to your `.zshrc`:
        - `export PATH="/opt/homebrew/bin:$PATH"`
- AdoptOpenJDK
    - `brew install --cask adoptopenjdk` (latest version)
    - To install AdoptOpenJDK 12 with HotSpot
        - `brew tap AdoptOpenJDK/openjdk`
        - `brew install --cask adoptopenjdk12`
- To get a list of available versions:
    - `brew search java`
    - `brew search jdk`
- Switch between different JDK versions
    - Add the below function into `~/.zshrc` or `~/.bashrc`
    ```bash
    jdk() {
        version=$1
        export JAVA_HOME=$(/usr/libexec/java_home -v"$version");
        java -version
    }
    ```
    - Source the profile and you can change the version like below:
    ```bash
    jdk 9
    jdk 11
    jdk 14
    ```