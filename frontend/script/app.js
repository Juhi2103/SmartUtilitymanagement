document.getElementById("registration-form").addEventListener("submit", function (event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    const usersList = document.getElementById("users-list");
    const newUser = document.createElement("li");
    newUser.textContent = `Name: ${name}, Email: ${email}`;
    usersList.appendChild(newUser);

    document.getElementById("name").value = "";
    document.getElementById("email").value = "";
});
