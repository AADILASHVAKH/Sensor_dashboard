function loadSensors() {

    fetch("/api/sensors")
        .then(response => response.json())
        .then(data => {

            document.getElementById("time").innerHTML =
                "Last Updated: " +
                new Date().toLocaleTimeString();

            let dashboard =
                document.getElementById("dashboard");

            dashboard.innerHTML = "";

            data.forEach(sensor => {

                dashboard.innerHTML +=

                    `
                    <div class="col-md-3">

                        <div class="card shadow">

                            <div class="card-body text-center">

                                <h5 class="sensor-name">
                                    ${sensor.name}
                                </h5>

                                <div class="sensor-value">
                                    ${sensor.values}
                                </div>

                                <span class="badge bg-success">
                                    ${sensor.status}
                                </span>

                            </div>

                        </div>

                    </div>
                    `;
            });

        });

}

loadSensors();

setInterval(loadSensors, 10000);