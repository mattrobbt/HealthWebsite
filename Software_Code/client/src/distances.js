const degreesToRadians = degrees => {
  return degrees * (Math.PI / 180);
};

/**
 *
 * @param {lat: number, lng: number} location1
 * @param {lat: number, lng: number} location2
 *
 * Slightly modified from source: https://www.movable-type.co.uk/scripts/latlong.html
 */
const calculateDistance = (location1, location2) => {
  var R = 6371e3; // metres
  var φ1 = degreesToRadians(location1.lat);
  var φ2 = degreesToRadians(location2.lat);
  var Δφ = degreesToRadians(location2.lat - location1.lat);
  var Δλ = degreesToRadians(location2.lng - location1.lng);

  var a =
    Math.sin(Δφ / 2) * Math.sin(Δφ / 2) +
    Math.cos(φ1) * Math.cos(φ2) * Math.sin(Δλ / 2) * Math.sin(Δλ / 2);
  var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

  var d = R * c;

  // kilometres
  return Math.round(d / 1000);
};

module.exports = {
  degreesToRadians: degreesToRadians,
  calculateDistance: calculateDistance
};
