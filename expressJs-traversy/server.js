const express = require("express");
const path = require("path");

const app = express();

// Middleware is a function that runs in between the incoming requests and outgoing responses.

//setup static folder (where we don't need route it gets automticly from there.)
// app.use(express.static(path.join(__dirname, "public")));

// // Route :
// app.get("/", (req, res) => {
//   res.sendFile(path.join(__dirname, "public", "index.html"));
// });

// app.get("/about", (req, res) => {
//   res.sendFile(path.join(__dirname, "public", "about.html"));
// });

app.listen(5000, () =>
  console.log(`The server is running on port number 5000`),
);

// Now without those route we can get all the files from 'public' folder but the cache here is to get about we have to write : "http://localhost:5000/about.html"

let posts = [
  { id: 1, title: "Post One" },
  { id: 2, title: "Post Two" },
  { id: 3, title: "Post Three" },
];

app.get("/api/posts", (req, res) => {
  res.json(posts);
});
