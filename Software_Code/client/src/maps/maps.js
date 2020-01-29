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

/** todo: add address */
const createMarkerContent = (hospital, procedure, price) => {
  return `<div><h3>${hospital}</h3><h4>${procedure}</h4><p>${price}</p></div>`;
};
/** calling functions for testing */
const map = createMap();
geoLocation(map);

const markerContent = createMarkerContent(
  'Ninewells Hospital',
  'Heart surgery',
  '$564737'
);

addMarker(map, { lat: 40, lng: -80 }, markerContent);
addMarker(map, { lat: 41, lng: -90 }, markerContent);
addMarker(map, { lat: 32, lng: -102 }, markerContent);
