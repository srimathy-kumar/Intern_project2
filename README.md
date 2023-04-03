# Facebook cloning (Friendzee) using NextJs, NextAuth, Rest API, React Hook, SpringBoot and MySQL



# project-documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=500px height=200px src="After posting the post.png" alt="Project logo"></a>
</p>


<h3 align="center">Home Page</h3>

---

<p align="center"> In my project, I had implemented the cloning concept in which I had used facebook cloning in name of "Friendzee" using NextJs, NextAuth, Rest API, React Hook, SpringBoot and MySQL. Facebook cloning is a scam in which attacker copies the profile picture of an authorized user, creates a new account using the person's name and send friend requests to people on the user's list. TailWindCSS is used for css styling which has in-built functionalities. Main Purpose of this project is to give facility to create community and convey the world closer together. My project helps to interact with friends by sharing images, videos and Activity/Feelings, Likes, Share and Comments in Post.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Flow Chart](#flowchart)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
Home Page of facebook cloning in name of "Friendzee" is a responsive website. The technologies used in this project are NextJs, TailwindCSS, NextAuth, Rest API and React Hook. There are a few important modules in the project like home page, creating post, adding/deleting the images, online/offline status of user and Like/Share/Comments. The data is accessed using Rest API and then rendered into the webpage. I took almost 40 - 50 hrs to complete this project. SkillLync helped me by providing the wire-frames for all relevant features.

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
1. Clone the repository and navigate to the root directory.
2. Install the required dependencies for the SpringBoot backend by running ./mvnw install or mvnw.cmd install on Windows or from https://start.spring.io/.
3. Configure the database connection by modifying application.properties with your database information.
4. Start the SpringBoot backend by running ./mvnw spring-boot:run or mvnw.cmd spring-boot:run on Windows or run "java application" from "Run As".
5. Navigate to the client directory and install the required dependencies for the Next.js frontend by running npm install.
6. Start the Next.js frontend by running npm run dev.
7. Open your web browser and navigate to http://localhost:3000 to view the application.


 See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites

we have to install 

Eclipse(java 17),
Visual Studio,
MySQL5,
Next-auth, 
next-react, 
react-redux, 
@reduxjs/toolkit, 
TailwindCSS, 
axios, 
eslint

### Installing
A step by step series of examples that tell you how to get a development env running.

Back-End:

https://start.spring.io/

https://mysql.com/downloads/mysql/

https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-03/R/eclipse-inst-jre-win64.exe

Front-End:

npx create-next-app facebook-clone

npm install -D tailwindcss postcss autoprefixer

npx tailwindcss init -p

npm install react-icons --save

npm install --save next-auth

npm install axios

npm install react-redux

npm install @reduxjs/toolkit

npm install --save-dev eslint



## 🔧 Running the tests <a name = "tests"></a>

Running the project using the following commands:

1. By clicking "java application" from "Run As" for SpringBoot to start the project

2. By typing "npm run dev" for nextJs in Front-End


### Break down into end to end tests
End-to-end tests are designed to test the complete flow of the application from the user's perspective so it's important to think about the different user actions and interactions that need to be tested. 

1. User authentication: Test the user authentication flow, including logging in with valid and invalid credentials, session management, and logout functionality using the NextAuth.

2. User profile: Test the user profile functionality, including editing user information, uploading profile pictures, and viewing other users' profiles.

3. Creating the post: Test the ability to create posts and comments, including the display of posts and comments in the user's feed, and the ability to delete or edit posts and comments.

4. Search functionality: Test the ability to search for users, posts, and other content within the application.

5. Status: Test the status whether user is online or offline mode.

6. Integration with external APIs: Test any integrations with external APIs for social media platforms.

By testing the application end-to-end, the entire application is functioning as expected and that users can successfully complete the tasks.

## 🎈 Usage <a name="usage"></a>
1. Installation: Need to install all the supporting dependencies as mentioned in installing topic.

Configuration: .

Usage instructions: Start the back end server, then start the front end using npm run dev, give the login access using NextAuth from facebook. After successful login, we can create the post using images/videos and Activity.

API documentation: In this project, REST Api is used to linking with front end and back end along with database.

Limitations or caveats: Mention any limitations or caveats that users should be aware of when using the application or library. This can include known bugs or issues, performance limitations, or any specific use cases that the application or library may not support.

Troubleshooting: Finally, provide a troubleshooting section that covers common issues that users may encounter when using the application or library, along with possible solutions or workarounds

## 🚀 Deployment <a name = "deployment"></a>
To deploy the application to a production environment, follow these steps:

1. Ensure that you have installed the required dependencies and have configured the necessary environment variables, such as the database connection details and any API keys or secrets(facebook).

2. Start the application by running "java application" from Run As for the backend.

3. Copy the built application to the server or hosting environment where you want to deploy the application.

4. Start the application by running "npm run dev" for the frontend.

5. Application is accessible from the internet by configuring http://loclhost:3000 and http://localhost:8080/api/v1/post.

6. Monitor the application for any errors or issues, and make any necessary updates or patches as needed.



## ⛏ Flow Chart <a name = "flowchart"></a>

![bg width:1000px](./LoginPageflowchart.png)

- [MySQL](https://www.mongodb.com/) - Database
- [Express](https://expressjs.com/) - Server Framework
- [NextJs](https://nextjs.org/) - Web Framework
- [Visual Studio](https://code.visualstudio.com/) - Server Environment

## ✍️ Authors <a name = "authors"></a>
- [@SkillLymc](https://github.com/kylelobo) - FSD

See also the list of [contributors](https://github.com/kylelobo/The-Documentation-Compendium/contributors) who participated in this project.

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Hat tip to anyone whose code was used
- Inspiration
- References
