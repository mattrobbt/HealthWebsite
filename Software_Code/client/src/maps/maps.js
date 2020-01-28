const createMap = () => {
  return new google.maps.Map(document.getElementById('map'), {
    zoom: 5,
    center: {
      lat: 38,
      lng: -98
    }
  });
};

/**
 * map -> google.maps.Map
 * position -> { lat: x, lng: y }
 * content -> html to be displayed on click
 */
const addMarker = (map, position, content) => {
  const marker = new google.maps.Marker({
    map: map,
    position: position
  });

  marker.addListener('click', () => {
    const infoWindow = new google.maps.InfoWindow({
      content: content
    });
    infoWindow.open(map, marker);
  });
};

/** calling functions for testing */
const map = createMap();

const markerContent = `<div><h4>Testing</h4></div>`;

addMarker(map, { lat: 40, lng: -85 }, markerContent);
