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
    //animation: google.maps.Animation.DROP
  });

  marker.addListener('click', () => {
    const infoWindow = new google.maps.InfoWindow({
      content: content
    });
    infoWindow.open(map, marker);
  });
};

/** todo: add address */
// const createMarkerContent = (hospital, procedure, price) => {
//   return `<div><h3>${hospital}</h3><h4>${procedure}</h4><p>${price}</p></div>`;
// };

const createMarkerContent = metaInfoItem => {
  return `<div><h3>${metaInfoItem.id}</h3><h4>${metaInfoItem.distance} miles (${metaInfoItem.location.lat}, ${metaInfoItem.location.lng})</h4></div>`;
};

const addMarkersFromMetaInfo = (map, metaInfo) => {
  for (let i = 0; i < metaInfo.length; i++) {
    addMarker(map, metaInfo[i].location, createMarkerContent(metaInfo[i]));
  }
};

const updateDistances = (userLocation, metaInfo) => {
  return calculateDistances(userLocation, metaInfo);
};

/** calling functions for testing */
let metaInfo = [
  {
    id: 1,
    location: {
      lat: 50,
      lng: 60
    },
    distance: undefined
  },
  {
    id: 2,
    location: {
      lat: 60,
      lng: 70
    },
    distance: undefined
  },
  {
    id: 3,
    location: {
      lat: 34,
      lng: 56
    },
    distance: undefined
  }
];

const map = createMap();
let userLocation;
let tempUserLocation = geoLocation(map);

// set user location
if (tempUserLocation !== undefined) {
  userLocation = tempUserLocation;
} else {
  userLocation = {
    lat: 38,
    lng: -98
  };
}

console.log(userLocation);

metaInfo = updateDistances(userLocation, metaInfo);
console.log(metaInfo);

addMarkersFromMetaInfo(map, metaInfo);

addMarker(map, userLocation, 'You are here');
