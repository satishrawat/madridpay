// Use environment variable to set the backend URL
const backendUrl = process.env.BACKEND_URL || 'http://192.168.31.176:8081';

fetch(`${backendUrl}/madridpay/backend/api/connection-status`)
  .then(response => response.json())
  .then(data => {
    if (data.status === "success") {
      document.getElementById("status").innerText = "Backend API is connected successfully!";
    } else {
      document.getElementById("status").innerText = "Unable to connect to Backend API.";
    }
  })
  .catch(error => {
    document.getElementById("status").innerText = "Error connecting to the backend API.";
  });

