function getCargoInformation() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
       if (this.readyState == 4 && this.status == 200) {
           document.getElementById('cargo-information').textContent = this.responseText;
       } else {
    	   document.getElementById('cargo-information').textContent = "No cargo with specified tracking id.";
       }
  };
  var cargoTrackingId = document.getElementById('cargo-tracking-id').value;
  xhttp.open("GET", "/cargo-tracker-web/cargo/" + cargoTrackingId, true);
  xhttp.send(null);
}