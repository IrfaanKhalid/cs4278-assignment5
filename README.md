# Directory Search Text Service

Documentation for Assignment 5 of CS4278 @ Vanderbilt University, Fall 2018.

## Project Overview

Generally, I've found it fairly difficult to locate accurate and up-to-date contact info for Vanderbilt University faculty, staff, and students. I hope to tackle this challenge - for the general Vanderbilt community as well as myself - by building a directory search text service. The functionality of this service isn't necessarily novel, but I intend to rely on the notions of software being a means to a) fulfill peoples' needs, and b) make people happy. This interface will incorporate the requirements of CS 4278 - building an SMS-first service for the broad Vanderbilt community - while also (hopefully) expediting the process of locating critical information our Commodores may need. Additionally, I hope to incorporate the results of my empathy interviews in developing and architecting the end-to-end data flow (primarily the front-facing end) of the application.

From a technical perspective, this application will rely heavily on the Twilio API. Deployed to an AWS EC2 instance, the server will be able to receive client requests for information about a person, ping Vanderbilt's person directory for information (either via API or webscraping - TBD), and return the most relevant information in a convenient format for users. The primary challenge in this will be to deliver _valuable_ information to my clients; rather than bog them down with irrelevant details, I hope to use what is a fairly straightforward technical stack to deliver on their needs as effectively as possible. Eventually, however, I hope for this interface to be improved, perhaps incorporating chat functionality into bots on other messaging services (Slack, Messenger, etc.).

My empathy surveys harped on the finer details of what users might be looking for in a service like this. I also wanted to understand - and empathize with - how much of a problem this is for the broader community. I wouldn't say this is the most pressing issue on campus, but from an engineering philosophy standpoint, I believe in optimization and improvement in all situations. I've also used this to eliminate some functionality that may not be as desirable as faculty/staff information search - primarily student information search, which appears to be non-essential for Vanderbilt's community members.

## Empathy Interviews

### [Questions](https://goo.gl/forms/4rYdAqeLFE9bnvys1)

1. How easy do you find it to find Vanderbilt University faculty and staff members' contact info?
2. Do you ever search for Vanderbilt faculty or staff members' contact info and only find outdated information?
3. How do you currently search for faculty and staff members' contact info?
4. What are your preferred means of communicating with faculty and/or staff about University-related topics? Select all that apply.
5. Have you ever needed to find a faculty or staff members' mailing info?
6. Have you needed to find a faculty or staff members' office location?
7. Have you ever wanted contact info for another student but been unable to find it?
8. Would you be comfortable with others being able to search for your contact information as a student?
9. What messaging services do you use? Select all that apply.
10. How would you classify yourself?
11. If there any specific features you'd like to see this service provide, please share them here!

### [Responses](https://docs.google.com/spreadsheets/d/1LHiIZg9E1d1LreL2ECpT2uiDGCRXtmWsrAwuv-6hjcU/edit?usp=sharing)

#### Question 1

8  
5  
7

#### Question 2

Yes  
Yes  
Yes

#### Question 3

I google their name + "vanderbilt"  
Google  
google and/or department website

#### Question 4

Email  
Email  
Email, In-person meeting

#### Question 5

No  
Yes  
No

#### Question 6

Yes  
Yes  
Yes

#### Question 7

Yes  
Yes  
No

#### Question 8

No  
Yes  
No

#### Question 9

SMS, Facebook Messenger, Slack, Twitter DMs  
SMS, Facebook Messenger, WhatsApp, Slack, Instagram DMs  
SMS, Facebook Messenger

#### Question 10

Vanderbilt undergraduate student  
Vanderbilt visitor (not officially affiliated with the University)  
Vanderbilt undergraduate student

#### Question 11

n/a  
n/a  
n/a
