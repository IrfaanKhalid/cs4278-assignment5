# Directory Search Text Service

Documentation for Assignment 5 of CS4278 @ Vanderbilt University, Fall 2018.

## Project Overview

Generally, I've found it fairly difficult to locate accurate and up-to-date contact info for Vanderbilt University faculty, staff, and students. I hope to tackle this challenge - for the general Vanderbilt community as well as myself - by building a directory search text service. The functionality of this service isn't necessarily novel, but I intend to rely on the notions of software being a means to a) fulfill peoples' needs, and b) make people happy. This interface will incorporate the requirements of CS 4278 - building an SMS-first service for the broad Vanderbilt community - while also (hopefully) expediting the process of locating critical information our Commodores may need. Additionally, I hope to incorporate the results of my empathy interviews in developing and architecting the end-to-end data flow (primarily the front-facing end) of the application.

From a technical perspe ll rely heavily on the Twilio API. Deployed to an AWS EC2 instance, the server will be able to receive client requests erson, ping Vanderbilt's person directory for information (either via API or webscraping - TBD), and return the most r onvenient format for users. The primary challenge in this will be to deliver _valuable_ information to my clien own with irrelevant details, I hope to use what is a fairly straightforward technical stack to deliver on their needs . Eventually, however, I hope for this interface to be improved, perhaps incorporating chat functionality into bots es (Slack, Messenger, etc.).

My empathy surveys harp what users might be looking for in a service like this. I also wanted to understand - and empathize with - how mu r the broader community. I wouldn't say this is the most pressing issue on campus, but from an engineering philosophy ptimization and improvement in all situations. I've also used this to eliminate some functionality that may ulty/staff information search - primarily student information search, which appears to be non-essential for Vande

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

## Development Approach

### Overview

My development approach is fairly granular. Per Agile methodologies, I believe in separating tasks, tackling them one at a time, and letting each task play into what is a final product with relative independence. By tackling each step individually and with full attention, I've enabled a number of safeguards against developing the wrong product, developing a non-functional product, making incorrect assumptions, building something that isn't valuable, and building something that isn't sustainable.

My own ideation is one safeguard, but by then conducting empathy surveys, I tailor the product even better. Then, by architecting my solution before beginning, I can ascertain technical feasibility and check that all components of my stack can and will play well together. Following this is implementation, which is straightforward, but _testing_ becomes a critical component of the software development lifecycle (SDLC); an implementation is useless if it doesn't actually function like it's supposed to. After testing is complete, I can _then_ be comfortable deploying the application to users. Finally, I recognize that requirements may change over time, my technical stack may have components become deprecated, etc. - this requires some awareness of maintenance requirements after deployment is complete.

Each step of the process provides some sort of filtering against poor software development, and by taking care to execute each step with awareness of the product _and_ its users, I hope to be able to avoid building the wrong product or building a non-functional product.

Regarding each component's time estimate, this will largely hapen in the architecting phase. Ideation and empathy surveys weren't necessarily the most time-intensive processes, and I was only concerned about the assignment deadline for these phases. Beyond that, however, the architecting stage (which I estimate will take 1-2 hours maximally) will allow me to understand what is _really_ going under the hood of this application, meaning I can more accurately estimate the amount of time that will be required for my development, testing, and deployment phases of development. These estimates may change - for instance, I may hit a technical roadblock in implementation - which is understandable. To avoid this being a huge hindrance, I hope to allot myself buffer time for each phase _just in case_ something goes awry, at which point I can assess the problem at hand and refine estimates for the current and subsequent phases.

### Ideation

Development of this project began with _ideation_ - that is, finding a problem feasible to solve within the given practical constraints (e.g., time, capital). I took a few days to ponder what problems exist within the Vanderbilt University community that affect my peers or other individuals and are both interesting and reasonable to solve with technology. After pondering and pestering friends about what kinds of problems they might see, I was able to generate the idea to build an improved directory search service with a texting interface. This solution solves existing problems, fits within the scope of the course, and can ultimately _deliver_ to its target demographic and make Vanderbilt students, faculty, and staff happy.

### Empathy Surveys

Conducting empathy surveys is effectively the same as gathering requirements. Coupled with initial ideation, the results of these surveys dictate what the problem I'm attempting to solve is, guide what the solution needs to look like, and provide a skeleton for the project. The motivation for conducting robust surveys is to ensure my own ideation doesn't miss any corner cases; ultimately, it's not just me that will use this product, so I need to understand what my actual consumers are looking for - especially with regards to anything they may want that I myself wouldn't have thought about.

### Architecting

The architecting stage is critical to ensure implementation doesn't occur without a solid understand of _what_ is being developed and _how_ it's being built. This is a huge safeguard for the development process and allows me to catch errors before they make their way into the codebase. This stage involves understanding my end product and determining what my technical stack will look like, how data will be communicated end-to-end, and what specific technical challenges I might face (meaning I can prepare for them/research them before diving into implementation).

I believe this stage to be an especially core component of the SDLC; this is what distinguishes software _engineering_ from programming. It's necessary to understand the product being built, how it will be built on its own, and how it plays into a broader ecosystem of problems, data, users, and software. This stage also allows us to ensure that the application development is sustainable and assumptions made about the product are correct from a technical perspective.

### Implementation

After architecting a solution, the actual product can be developed. The rationale for this stage should be obvious - code must be written for a product to finally exist. In this stage, I'll be taking the software architecture devised in the previous stage of development and bringing it to fruition, tackling technical challenges along the way. It's at this point that estimates may need to be refined should technical hurdles arise. This is to be expected - again, especially at this stage - and appropriate buffers in our time estimates need to exist to account for such hurdles.

This application will be developed with a NodeJS backend and using the Twilio API. Additionally, the deployment phase will leverage AWS EC2 to make the product publicly accessible to its end users.

### Testing

Once the product is implemented, to ensure functionality in any and all cases, thorough testing must occur. This is likely to involve unit testing, integration testing, as well as manual beta testing with users to ensure the software behaves correctly and as expected. Should anything in this stage be deemed problematic, we cycle back to the implementation stage to remedy problems. This stage is _absolutely critical_ before deployment; we need one final check that our product is functional and works in practice. This is also a safeguard against delivering the wrong product or any false assumptions that weren't caught by this point.

Testing will leverage some existing NodeJS testing framework - perhaps Mocha - alongside manual human testing of end-to-end functionality.

### Deployment

After the product is what the users want - which is determined via testing - it can be deployed for use. Without deployment, the software may reside in a repository and be kept from the world, rendering it useless.

Deployment will take advantage of AWS EC2, making the service's API open for use in some form.

### Maintenance

Maintenance is critical for a slew of reasons. This allows me to tackle technical challenges that didn't exist during implementation (e.g., an API changes, an external service is deprecated, etc) and restore the desired application state. This also serves as a final check for anything that _may_ have slipped through the cracks of the development process, such as strange corner cases. Finally, this provides the opportunity to add features as users' needs change over time, which is a natural flow of events for software built with the human users in mind. Things change and software will have to keep up - hence, a maintenance stage being so critical to the SDLC.
