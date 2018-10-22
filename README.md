# CS 4278 Assignment 5 (Prototype)

## Disclaimer

For my initial planning documentation, please see the `master` branch of this repository.

## Description

This prototype is more or less a proof-of-concept of using Clojure with the Twilio API. I wanted to implement more functionality, but the author the API I'm using, which is wonderfully demonstrated on Twilio's blog [here](https://www.twilio.com/blog/2016/02/getting-started-with-clojure.html), took down the public GitHub repo. After reaching out to him for the original API docs, I did not receive a response in time to implement more functionality.

That being said, this prototype utilizes the Twilio API to send users a random faculty or student's contact information. It's a fun demonstration of the Twilio API and some interesting Clojure features, including: external dependency usage (see `project.clj`) and string parsing.

## Installation

Clone this repo.

## Usage

### Local Execution Via Terminal

1. Clone this repo
2. In terminal, from the repo's root of directory, `cd cs4278-assignment5`
3. Now, run `lein deps` to install dependencies
4. Replace the parameters on line 45 of `core.clj` with your Twilio credentials. If you're a grader, you can use my credentials in my Brightspace submission, `part3.txt`.
5. Replace the _:To_ phone number on line 48 of core.clj with your own using E.164 notation.
6. Run `lein run` a text!

## Remote Execution from EC2

## Testing
