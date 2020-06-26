function getCargoInformation() {
  document.getElementById('cargo-information').textContent = "Fetching cargo informtion...";
    var cargoTrackingId = document.getElementById('cargo-tracking-id').value;
    fetchPromise('/cargo-tracker-web/cargo/' + cargoTrackingId).then(cargo => {
        document.getElementById('cargo-information').textContent = JSON.stringify(cargo);
    }).catch(error => {
        document.getElementById('cargo-information').textContent = "No cargo with specified tracking id.";
    });
}

async function fetchPromise(uri) {
  const response = await fetch(uri);
  return await response.json();
}
