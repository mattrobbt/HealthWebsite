const geoLocation = map => {
  const infoWindow = new google.maps.InfoWindow();
  var options = {
    timeout: 10000
  };
  // HTML5 Geolocation turned on
  if (navigator.geolocation) {
    console.log('nav.geoloc');
    console.log('trying again');
    navigator.geolocation.getCurrentPosition(
      location => {
        let position = {
          lat: location.coords.latitude,
          lng: location.coords.longitude
        };
        console.log(position);
        console.log('success?');

        infoWindow.setPosition(position);
        infoWindow.setContent('Valid Location.');
        map.setCenter(position);
      },
      console.log('error callback?'),
      options
    ); //handleError(map, infoWindow, map.getCenter()));
  } else {
    errorCallback(map, infoWindow, map.getCenter());
  }
};

// Geolocation code

const errorCallback = (map, infoWindow, position) => {
  console.log('Handling error');
  infoWindow.setPosition(position);
  infoWindow.setContent();
};
