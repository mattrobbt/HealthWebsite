/**
 * Internal functionality -- no tests for this logic as most of it is DOM based or relies on the Google Maps API
 */

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
    position: position,
    animation: google.maps.Animation.DROP
  });

  marker.addListener('click', () => {
    const infoWindow = new google.maps.InfoWindow({
      content: content
    });
    infoWindow.open(map, marker);
  });
};

// TODO: update metainfo to store & use name, price //address?
const createMarkerContent = metaInfoItem => {
  return `<div><h3>${metaInfoItem.id}</h3><h4>${metaInfoItem.distance} miles (${metaInfoItem.location.lat}, ${metaInfoItem.location.lng})</h4></div>`;
};

const addMarkersFromMetaInfo = (map, metaInfo) => {
  for (let i = 0; i < metaInfo.length; i++) {
    addMarker(map, metaInfo[i].location, createMarkerContent(metaInfo[i]));
  }
};

// radius in metres
const addCircle = (map, radius, location) => {
  const circle = new google.maps.Circle({
    strokeColor: '#16aaf0',
    strokeOpacity: 0.3,
    strokeWeight: 2,
    fillColor: '#16aaf0',
    map: map,
    center: location,
    radius: radius
  });

  return circle;
};

const removeCircle = circle => {
  circle.setMap(null);
  circle = null;
};

const updateDistances = (userLocation, metaInfo) => {
  return calculateDistances(userLocation, metaInfo);
};

/** To be used from java in generated code to populate metaInfo */
const addToMetaInfo = (metaInfo, id, lat, lng) => {
  const newMetaInfoItem = {
    id: id,
    location: {
      lat: lat,
      lng: lng
    },
    distance: undefined
  };
  metaInfo.push(newMetaInfoItem);

  return metaInfo;
};

/**
 *  example code to be called externally (Java)
 */

// initialising & populating metaInfo
let metaInfo = [];
metaInfo = addToMetaInfo(metaInfo, 1, 45, -120);
metaInfo = addToMetaInfo(metaInfo, 2, 34, -90);
metaInfo = addToMetaInfo(metaInfo, 3, 40, -80);
metaInfo = addToMetaInfo(metaInfo, 4, 27, -82);

// initialising map
const map = createMap();

// getting location data, defaults to central USA if geolocation is rejected
let userLocation;
let tempUserLocation = geoLocation(map);

if (tempUserLocation !== undefined) {
  userLocation = tempUserLocation;
} else {
  userLocation = {
    lat: 38,
    lng: -98
  };
}

// calculate & add distances to metaInfo
metaInfo = updateDistances(userLocation, metaInfo);

// display markers on map
addMarker(map, userLocation, 'You are here');
addMarkersFromMetaInfo(map, metaInfo);

// optional circle for filter
let distanceRange = 1000000;
const circle = addCircle(map, distanceRange, userLocation);

// remove circle
//removeCircle(circle);
