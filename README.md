# Simple PLAY Framework v2.8.x TODO List Scala Application

## About
 This repository is created to help people who are new to PLAY framework to get started with a simple todolist app. The [documentation](https://www.playframework.com/documentation/2.0.4/ScalaTodoList) is outdated and the code is not working, therefore this is an updated version to assist some people who are struggling with it. The key changes are the library dependencies required for the project that can be seen in `todolist/build.sbt` followed by some minor code syntax changes.

## Requirements

- Java 8 or later
- SBT 1.3.13 or later

## Build and run the project

To build and run the project:

1. Use a command window to change into the example project directory, for example: `cd todolist`

2. Build the project. Enter: `sbt run`. The project builds and starts the embedded HTTP server. Since this downloads libraries and dependencies, the amount of time required depends partly on your connection's speed.

3. After the message `Server started, ...` displays, enter the following URL in a browser: <http://localhost:9000>

The Play application will start up.<br>

## Functionalities
- Enter a task in the input field and click the **Add** button. <br>
- The task will be added to the list. You can add as many tasks as you want. <br>
- To delete a task, click the **Delete** button next to it.
