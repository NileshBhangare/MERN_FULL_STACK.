document
  .getElementById("registrationForm")
  .addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent the default form submission

    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    console.log("Name:", name);
    console.log("Email:", email);
    console.log("Password:", password);

    alert("Registration successful!");
  });
