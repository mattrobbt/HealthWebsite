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

const markerContent1 = createMarkerContent(
  'University of Alabama Hospital',
  'Heart surgery',
  '$273,737'
);
const markerContent2 = createMarkerContent(
  'Mayo Clinic Hospital',
  'Heart surgery',
  '$226,998'
);
const markerContent3 = createMarkerContent(
  'Baptist Health Medical Center Little Rock',
  'Heart surgery',
  '$162,530'
);
const markerContent4 = createMarkerContent(
  'UC San Diego Health Hillcrest',
  'Heart surgery',
  '$319,044'
);

addMarker(map, { lat: 33.5065, lng: -86.803 }, markerContent1);
addMarker(map, { lat: 33.6591, lng: -111.9565 }, markerContent2);
addMarker(map, { lat: 34.7443, lng: -92.3808 }, markerContent3);
addMarker(map, { lat: 32.7551, lng: -117.1659 }, markerContent4);
