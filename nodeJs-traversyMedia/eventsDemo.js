import { EventEmitter } from "events";

const myEmitter = new EventEmitter();

function greetHandler(name) {
  console.log("Hello " + name);
}

function goodbyeHandler(name) {
  console.log("Goodbye " + name);
}

//Register event listners
myEmitter.on("greet", greetHandler());
myEmitter.on("goodbye", goodbyeHandler());

// Emit events
myEmitter.emit("greet", "John");
myEmitter.emit("goodby", "John");

// Error handling
myEmitter.on("error", (err) => {
  console.log("An error Occured:", err);
});

// Simulate error
myEmitter.emit("error", new Error("Something went wrong"));
